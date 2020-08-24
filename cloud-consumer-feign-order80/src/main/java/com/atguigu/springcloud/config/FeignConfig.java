package com.atguigu.springcloud.config;/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.config
 * @ClassName: FeignConfig
 * @Author: 李甫圳
 * @Date: 2020/8/18 20:08
 * @Version: 1.0
 */

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>FeignConfig Feign自带日志，</p>
 *
 * @author lfz
 * @date 2020/8/18 20:08
 * @version
 **/
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        //此处日志指的是请求头都会包括，还有一个日志指的是提供者返回的日志级别，2者不同
        return Logger.Level.FULL;
    }
}
