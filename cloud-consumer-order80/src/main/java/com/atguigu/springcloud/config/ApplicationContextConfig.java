package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <p>ApplicationContextConfig TODO</p>
 *
 * @author lfz
 * @date 2020/8/14 14:23
 * @version
 **/
@Configuration
public class ApplicationContextConfig {
    @Bean
    //@LoadBalanced LoadBalanced 负载均衡配置，不然配置集群 现在自己手写一个
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
