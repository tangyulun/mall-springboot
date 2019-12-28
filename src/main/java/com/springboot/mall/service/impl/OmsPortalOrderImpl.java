package com.springboot.mall.service.impl;

import com.springboot.mall.component.CancelOrderSender;
import com.springboot.mall.dto.CommonResult;
import com.springboot.mall.dto.OrderParam;
import com.springboot.mall.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 前台订单管理Service
 */
@Service
public class OmsPortalOrderImpl implements OmsPortalOrderService {
  private static Logger LOGGER = LoggerFactory.getLogger(OmsPortalOrderImpl.class);

  @Autowired
  private CancelOrderSender cancelOrderSender;

  @Override
  public Object generateOrder(OrderParam orderParam) {
    LOGGER.info("process generateOrder");
    //下单完成后开启一个延迟消息，用于当用户没有付款时取消订单（orderId应该在下单后生成）
    sendDelayMessageCancelOrder(11L);
    return new CommonResult().success("下单成功");
  }

  @Override
  public void cancelOrder(Long orderId) {
    LOGGER.info("process cancelOrder orderId:{}",orderId);
  }

  private void sendDelayMessageCancelOrder(Long orderId) {
    //获取订单超时时间，假设为60分钟
    long delayTimes = 30 * 1000;
    //发送延迟消息
    cancelOrderSender.sendMessage(orderId, delayTimes);
  }

}
