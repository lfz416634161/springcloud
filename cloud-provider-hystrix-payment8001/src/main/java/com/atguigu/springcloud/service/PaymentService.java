package com.atguigu.springcloud.service;/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service
 * @ClassName: PaymentService
 * @Author: 李甫圳
 * @Date: 2020/8/18 20:46
 * @Version: 1.0
 */

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * <p>PaymentService 熔断服务层</p>
 *
 * @author lfz
 * @date 2020/8/18 20:46
 * @version
 **/
@Service
public class PaymentService {
    /**
     * 正常访问，肯定OK
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池:"+Thread.currentThread().getName()+" paymentInfo_OK,id"+id+"\t"+"O(∩_∩)O哈哈~";
    }
    //P端的降级服务 3000代表3秒之内
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler" ,commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")})
    public String paymentInfo_TimeOut(Integer id){
        try {
            //int age = 10/0;
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池:"+Thread.currentThread().getName()+" paymentInfo_OK,id"+id+"\t"+"O(∩_∩)O哈哈~"+"耗时(秒)";
    }
    public String paymentInfo_TimeOutHandler(Integer id){

        return "线程池:"+Thread.currentThread().getName()+" 8001系统错误或运行报错，繁忙请稍后再试"+id+"\t"+"o(╥﹏╥)o";
    }

    //======================服务熔断
    @HystrixCommand(fallbackMethod = "paymentInfo_Circuit",commandProperties = {
            @HystrixProperty(name="circuitBreaker.enabled",value = "true"),//是否开启断路器
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "10"),// 请求次数
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value = "10000"),// 时间窗口期
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "60")// 失败率
            // 加起来就是在10s内的10次请求中如果失败超过6次进入服务熔断
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        if (id<0){
            throw new RuntimeException("id 不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();//等价于 UUIDrandomUUID（）

        return "调用成功："+serialNumber;
    }
    //默认 10秒钟 20次请求，失败率50 则进入熔断-->进入降级，5秒后自动恢复
    // 意思就是访问次数 超过10次，然后失败率高达60% 则不管结果直接到断路器中，然后10秒后，又会恢复
    public String paymentInfo_Circuit(Integer id){
        return "id不能为负数："+id;
    }
}
