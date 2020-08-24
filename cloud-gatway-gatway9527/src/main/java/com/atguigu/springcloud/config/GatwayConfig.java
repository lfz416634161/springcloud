package com.atguigu.springcloud.config;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;


/**
 * <p>GatwayConfig 网络配置</p>
 *
 * @author lfz
 * @date 2020/8/20 16:07
 * @version
 **/
@Configuration
public class GatwayConfig {
    /*使用编码，学习了解一下就好*/
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder  routes = routeLocatorBuilder.routes();

        /*
         * 代表访问http://localhost:9527/guonei
         * 跳转到http://news.baidu.com/guonei
         * */
        //此处的r指的是 new PredicateSpec() 为什么jdk马上就能确认是他去点path 这个我也不明白
        routes.route("route1",
                r->r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }
}
