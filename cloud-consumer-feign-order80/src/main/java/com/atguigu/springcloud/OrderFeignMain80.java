package com.atguigu.springcloud;/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: OrderFeignMain80
 * @Author: 李甫圳
 * @Date: 2020/8/18 19:31
 * @Version: 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>OrderFeignMain80 TODO</p>
 *
 * @author lfz
 * @date 2020/8/18 19:31
 * @version
 **/
@SpringBootApplication
@EnableFeignClients //使用Feign 激活并开启
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}
