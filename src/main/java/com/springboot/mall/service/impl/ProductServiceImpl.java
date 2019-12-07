package com.springboot.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.springboot.mall.dao.PmsProductMapper;
import com.springboot.mall.dto.PmsProductQueryParam;
import com.springboot.mall.model.PmsProduct;
import com.springboot.mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ProductService的实现类
 */
@Service
public class ProductServiceImpl implements ProductService {
  @Autowired
  private PmsProductMapper pmsProductMapper;

  @Override
  public List<PmsProduct> selectByPrimaryKey(Long id){
    return null;
  }
  @Override
  public List<PmsProduct> list(PmsProductQueryParam productQueryParam, Integer pageNum, Integer pageSize){
    PageHelper.startPage(pageNum,pageSize);
    List<PmsProduct> productList = pmsProductMapper.selectAllPmsProduct(pageNum, pageSize);
    return productList;
  }
}
