package com.springboot.mall.model;

import java.math.BigDecimal;

public class PmsProductLadder {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long productId;

    /**
     * 满足的商品数量
     */
    private Integer count;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 折后价格
     */
    private BigDecimal price;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return product_id 
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 
     * @param productId 
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 满足的商品数量
     * @return count 满足的商品数量
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 满足的商品数量
     * @param count 满足的商品数量
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 折扣
     * @return discount 折扣
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 折扣
     * @param discount 折扣
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 折后价格
     * @return price 折后价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 折后价格
     * @param price 折后价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}