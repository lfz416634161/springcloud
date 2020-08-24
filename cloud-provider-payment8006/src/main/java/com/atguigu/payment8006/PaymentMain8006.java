package com.atguigu.payment8006;/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.payment8006
 * @ClassName: PaymentMain8006
 * @Author: 李甫圳
 * @Date: 2020/8/17 17:17
 * @Version: 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>PaymentMain8006 consul服务提供者</p>
 *
 * @author lfz
 * @date 2020/8/17 17:17
 * @version
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8006.class,args);
    }
}
