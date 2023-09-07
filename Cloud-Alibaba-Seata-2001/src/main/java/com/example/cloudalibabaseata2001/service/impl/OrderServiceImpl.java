package com.example.cloudalibabaseata2001.service.impl;

import com.example.cloudalibabaseata2001.dao.OrderDao;
import com.example.cloudalibabaseata2001.domain.Order;
import com.example.cloudalibabaseata2001.service.AccountService;
import com.example.cloudalibabaseata2001.service.OrderService;
import com.example.cloudalibabaseata2001.service.StorageService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;

/*    @Override
    public void create(Order order) {

    }*/

    @Override
    public void create(Order order) {
        log.info("开始订单创建");
        orderDao.create(order);

        log.info("订单服务开始调用");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("订单微服务开始调用库存，开始-------扣减库存数量");

        log.info("开始调用客户数据");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("订单微服务开始调用用户数据，开始-------扣减用户支付金额");

        log.info("开始修改订单状态----");
        orderDao.update(order.getUserId(),0);
        log.info("修改订单状态---->成功");

        log.info("订单下单成功");
    }
}
