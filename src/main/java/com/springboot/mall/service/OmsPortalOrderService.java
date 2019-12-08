package com.springboot.mall.service;

import com.springboot.mall.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * 前台订单管理Service
 */
public interface OmsPortalOrderService {
  /**
   * 根据提交信息生成订单
   */
  @Transactional
  Object generateOrder(OrderParam orderParam);

  /**
   * 取消单个超时订单
   */
  @Transactional
  void cancelOrder(Long orderId);
}
