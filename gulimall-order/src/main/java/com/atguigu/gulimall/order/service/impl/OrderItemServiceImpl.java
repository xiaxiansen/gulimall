package com.atguigu.gulimall.order.service.impl;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.atguigu.gulimall.order.entity.OrderReturnReasonEntity;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.order.dao.OrderItemDao;
import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.atguigu.gulimall.order.service.OrderItemService;

@RabbitListener(queues = {"hello-java-queue"})
@Service("orderItemService")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemDao, OrderItemEntity> implements OrderItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderItemEntity> page = this.page(
                new Query<OrderItemEntity>().getPage(params),
                new QueryWrapper<OrderItemEntity>()
        );

        return new PageUtils(page);
    }
    @RabbitHandler
    public void recieveMessage(Message message,
                               OrderReturnReasonEntity content,
                               Channel channel) throws InterruptedException {
        byte[] body = message.getBody();
//        System.out.println("接收到消息.."+content);
        //消息头属性信息
        MessageProperties properties = message.getMessageProperties();
//        Thread.sleep(3000);
//        System.out.println("消息处理完成=>"+content.getName());
        long deliveryTag = message.getMessageProperties().getDeliveryTag();
//        System.out.println("deliveryTag==>"+deliveryTag);
        //签收货物，非批量模式
        try {
            if(deliveryTag%2 == 0){
                //收货
                channel.basicAck(deliveryTag, false);
//                System.out.println("签收了货物..."+deliveryTag);
            }else {
                //退货
                channel.basicNack(deliveryTag, false, true);
//                System.out.println("没有签收了货物..."+deliveryTag);
            }
        } catch (IOException e) {
            //网络中断
        }
    }
    @RabbitHandler
    public void recieveMessage2(OrderEntity content) throws InterruptedException {
//        System.out.println("消息处理完成=>"+content);
    }

}