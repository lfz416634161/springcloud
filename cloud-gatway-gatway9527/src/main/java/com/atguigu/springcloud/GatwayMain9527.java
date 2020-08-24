package com.atguigu.springcloud;/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: GatwayMain9527
 * @Author: 李甫圳
 * @Date: 2020/8/20 15:49
 * @Version: 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>GatwayMain9527 网关</p>
 *
 * @author lfz
 * @date 2020/8/20 15:49
 * @version
 **/
@SpringBootApplication
@EnableEurekaClient
public class GatwayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GatwayMain9527.class,args);
    }
}
