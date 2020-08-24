package com.atguigu.springcloud;/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: EurekaMain7002
 * @Author: 李甫圳
 * @Date: 2020/8/14 17:27
 * @Version: 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>EurekaMain7002 注册中心7002</p>
 *
 * @author lfz
 * @date 2020/8/14 17:27
 * @version
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
