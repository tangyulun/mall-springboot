package com.springboot.mall.model;

import java.math.BigDecimal;

public class PmsProductFullReduction {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long productId;

    /**
     * 
     */
    private BigDecimal fullPrice;

    /**
     * 
     */
    private BigDecimal reducePrice;

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
     * 
     * @return full_price 
     */
    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    /**
     * 
     * @param fullPrice 
     */
    public void setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    /**
     * 
     * @return reduce_price 
     */
    public BigDecimal getReducePrice() {
        return reducePrice;
    }

    /**
     * 
     * @param reducePrice 
     */
    public void setReducePrice(BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
    }
}