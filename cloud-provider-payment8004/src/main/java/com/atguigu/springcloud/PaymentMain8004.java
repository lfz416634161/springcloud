package com.atguigu.springcloud;/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: PaymentMain8004
 * @Author: 李甫圳
 * @Date: 2020/8/17 16:01
 * @Version: 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>PaymentMain8004 zookeeper服务提供者</p>
 *
 * @author lfz
 * @date 2020/8/17 16:01
 * @version
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
