package com.springboot.mall.service;

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
  List<PmsProduct> selectByIDPmsProduct(Long id);

  /**
   * 分页查询商品
   * @param pageNum
   * @param pageSize
   * @return
   */
  List<PmsProduct> list(Integer pageNum, Integer pageSize);

  /**
   * 根据name模糊查询商品
   * @param pageNum
   * @param pageSize
   * @param name
   * @return
   */
  List<PmsProduct> byNameList(Integer pageNum, Integer pageSize,String name);
}
