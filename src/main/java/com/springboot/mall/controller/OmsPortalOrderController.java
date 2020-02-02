package com.springboot.mall.controller;

import com.springboot.mall.dto.OrderParam;
import com.springboot.mall.service.OmsPortalOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 订单管理Controller
 */
@RestController
@Api(tags = "OmsPortalOrderController", description = "订单管理")
@RequestMapping("/order")
public class OmsPortalOrderController {
  @Autowired
  private OmsPortalOrderService portalOrderService;

  @ApiOperation("根据购物车信息生成订单")
  @RequestMapping(value = "/generateOrder", method = RequestMethod.POST)
  public Object generateOrder(@RequestBody OrderParam orderParam) {
    return portalOrderService.generateOrder(orderParam);
  }
}
