package com.atguigu.springcloud.config;/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.config
 * @ClassName: ApplicationContentConfig
 * @Author: 李甫圳
 * @Date: 2020/8/17 16:53
 * @Version: 1.0
 */

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <p>ApplicationContentConfig TODO</p>
 *
 * @author lfz
 * @date 2020/8/17 16:53
 * @version
 **/
@Configuration
public class ApplicationContentConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTmeplate(){
        return new RestTemplate();
    }
}
