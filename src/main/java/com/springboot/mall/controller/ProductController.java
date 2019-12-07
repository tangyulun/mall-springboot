package com.springboot.mall.controller;

import com.springboot.mall.dto.CommonResult;
import com.springboot.mall.dto.PmsProductQueryParam;
import com.springboot.mall.model.PmsProduct;
import com.springboot.mall.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 商品管理
 */
@Controller
@Api(tags = "ProductController", description = "商品管理")
public class ProductController {
  @Autowired
  private ProductService productService;

  @ApiOperation(value = "分页查询所有商品")
  @RequestMapping(value = "/productList", method = RequestMethod.POST)
  @ResponseBody
  public Object list(PmsProductQueryParam productQueryParam,
                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize){
    List<PmsProduct> productList = productService.list(productQueryParam, pageNum, pageSize);
    return new CommonResult().pageSuccess(productList);
  }
}
