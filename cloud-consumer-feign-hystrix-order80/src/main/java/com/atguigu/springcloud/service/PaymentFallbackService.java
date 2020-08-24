package com.atguigu.springcloud.service;/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service
 * @ClassName: PaymentFallbackService
 * @Author: 李甫圳
 * @Date: 2020/8/20 10:29
 * @Version: 1.0
 */

import org.springframework.stereotype.Component;

/**
 * <p>PaymentFallbackService TODO</p>
 *
 * @author lfz
 * @date 2020/8/20 10:29
 * @version
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------Fallback-paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------Fallback-paymentInfo_TimeOut";
    }
}
