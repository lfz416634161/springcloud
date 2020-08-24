package com.atguigu.springcloud;/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: HystrixDashboardMain9002
 * @Author: 李甫圳
 * @Date: 2020/8/20 14:20
 * @Version: 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * <p>HystrixDashboardMain9002 TODO</p>
 *
 * @author lfz
 * @date 2020/8/20 14:20
 * @version
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9002 {
    public static void main(String[] args) {
        //localhost:8001/hystrix
        //启动输入 http://localhost:8001/hystrix.stream
        //2000 T3
        SpringApplication.run(HystrixDashboardMain9002.class,args);
    }
}
