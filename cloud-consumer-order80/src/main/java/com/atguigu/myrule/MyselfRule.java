package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>MyselfRule ribbon负载均衡</p>
 *
 * @author lfz
 * @date 2020/8/17 21:41
 * @version
 **/

@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule(){
        //默认是RoundRobinRule 轮循
        return new RandomRule();//定义随机
    }
}
