package com.springboot.mall.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 生成订单时传入的参数
 */
@Setter
@Getter
public class OrderParam {
  //收货地址id
  private Long memberReceiveAddressId;
  //优惠券id
  private Long couponId;
  //使用的积分数
  private Integer useIntegration;
  //支付方式
  private Integer payType;

  public Long getMemberReceiveAddressId() {
    return memberReceiveAddressId;
  }
}
