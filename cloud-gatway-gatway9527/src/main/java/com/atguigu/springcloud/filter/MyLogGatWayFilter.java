package com.atguigu.springcloud.filter;/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.filter
 * @ClassName: MyLogGatWayFilter
 * @Author: 李甫圳
 * @Date: 2020/8/24 14:10
 * @Version: 1.0
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * <p>MyLogGatWayFilter GayWay过滤器</p>
 *
 * @author lfz
 * @date 2020/8/24 14:10
 * @version
 **/
@Component
@Slf4j
public class MyLogGatWayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("*********come in MyLogGatWayFilter" + new Date());
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if(uname == null){
            log.info("***用户名为null，非法用户");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
