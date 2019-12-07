package com.springboot.mall.service;

import com.springboot.mall.dto.PmsProductQueryParam;
import com.springboot.mall.model.PmsProduct;

import java.util.List;

/**
 * ProductService
 */
public interface ProductService {
  /**
   * 根据ID来查询商品
   * @param id
   * @return
   */
  List<PmsProduct> selectByPrimaryKey(Long id);

  /**
   * 分页查询商品
   * @param productQueryParam
   * @param pageNum
   * @param pageSize
   * @return
   */
  List<PmsProduct> list(PmsProductQueryParam productQueryParam, Integer pageNum, Integer pageSize);
}
