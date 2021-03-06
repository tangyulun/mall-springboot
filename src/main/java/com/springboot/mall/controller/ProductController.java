package com.springboot.mall.controller;

import com.springboot.mall.dto.CommonResult;
import com.springboot.mall.model.PmsProduct;
import com.springboot.mall.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品管理
 */
@RestController
@Api(tags = "ProductController", description = "商品管理")
public class ProductController {
  @Autowired
  private ProductService productService;

  @ApiOperation(value = "根据ID查询商品")
  @RequestMapping(value = "/productByIDList", method = RequestMethod.POST)
  public Object selectByIDList(@RequestParam(value = "id") Long id){
    List<PmsProduct> productList = productService.selectByIDPmsProduct(id);
    return new CommonResult().pageSuccess(productList);
  }

  @ApiOperation(value = "分页查询所有商品")
  @RequestMapping(value = "/productList", method = RequestMethod.POST)
  public Object list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize){
    List<PmsProduct> productList = productService.list(pageNum, pageSize);
    return new CommonResult().pageSuccess(productList);
  }
  @ApiOperation(value = "根据name分页模糊查询商品")
  @RequestMapping(value = "/productByNameList", method = RequestMethod.POST)
  public Object selectByNameList( @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                     @RequestParam(value = "name") String name){
    List<PmsProduct> productList = productService.byNameList(pageNum, pageSize, name);
    return new CommonResult().pageSuccess(productList);
  }
}
