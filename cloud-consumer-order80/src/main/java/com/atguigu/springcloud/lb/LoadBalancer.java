package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.lb
 * @ClassName: LoadBalancer
 * @Author: 李甫圳
 * @Date: 2020/8/18 18:40
 * @Version: 1.0
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
