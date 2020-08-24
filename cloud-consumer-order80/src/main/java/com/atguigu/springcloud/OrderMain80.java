package com.atguigu.springcloud;
import com.atguigu.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

import javax.naming.Name;

/**
 * <p>OrderMain80 启动类</p>
 *
 * @author lfz
 * @date 2020/8/14 15:04
 * @version
 **/
/*
* SpringBootApplication包下有一个ComponentScan 包，他的作用是，
* 启动类下面的所有包都交给Spring，
* 注意：ribbon官方强烈说明不要使用ComponentScan否则会没有个性化
* 即需在启动类同级建设ribbon
*
 */

@SpringBootApplication
@EnableEurekaClient
// 80端口所访问的微服务，我的配置是MyselfRule
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE" ,configuration = MyselfRule.class)
public class OrderMain80 {

    public static void main(String[] args) {

        SpringApplication.run(OrderMain80.class,args);
    }
}
