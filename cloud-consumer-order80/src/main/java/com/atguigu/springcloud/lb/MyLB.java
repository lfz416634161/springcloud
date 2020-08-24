package com.atguigu.springcloud.lb;/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.lb
 * @ClassName: MyLB
 * @Author: 李甫圳
 * @Date: 2020/8/18 18:44
 * @Version: 1.0
 */

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>MyLB 模拟ribbon轮询算法</p>
 *
 * @author lfz
 * @date 2020/8/18 18:44
 * @version
 **/
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);
    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            next = current>=2147483647 ? 0 : current+1;
        // 防止并发导致的问题， 所以用了原子方式，返回boolean
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("****第几次访问，次数next:"+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        // 注册上来的实例总数
        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
