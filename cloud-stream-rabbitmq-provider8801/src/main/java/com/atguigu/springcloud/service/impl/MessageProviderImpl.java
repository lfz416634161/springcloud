package com.atguigu.springcloud.service.impl;/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service.impl
 * @ClassName: MessageProviderImpl
 * @Author: 李甫圳
 * @Date: 2020/8/25 16:02
 * @Version: 1.0
 */

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;

import java.awt.image.ImageConsumer;

/**
 * <p>MessageProviderImpl TODO</p>
 *
 * @author lfz
 * @date 2020/8/25 16:02
 * @version
 **/
@EnableBinding //消息生产者的发送管道
public class MessageProviderImpl implements IMessageProvider {
    @Override
    public String send() {
        return null;
    }
}
