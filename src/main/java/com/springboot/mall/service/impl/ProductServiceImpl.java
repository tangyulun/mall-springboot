package com.springboot.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.springboot.mall.dao.PmsProductMapper;
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
  public List<PmsProduct> selectByIDPmsProduct(Long id){
    List<PmsProduct> productList = pmsProductMapper.selectByIDPmsProduct(id);
    return productList;
  }
  @Override
  public List<PmsProduct> list(Integer pageNum, Integer pageSize){
    PageHelper.startPage(pageNum,pageSize);
    List<PmsProduct> productList = pmsProductMapper.selectAllPmsProduct(pageNum, pageSize);
    return productList;
  }
  @Override
  public List<PmsProduct> byNameList(Integer pageNum, Integer pageSize, String name){
    PageHelper.startPage(pageNum,pageSize);
    List<PmsProduct> productList = pmsProductMapper.selectByNamePmsProduct(pageNum,pageSize,name);
    return productList;
  }
}
