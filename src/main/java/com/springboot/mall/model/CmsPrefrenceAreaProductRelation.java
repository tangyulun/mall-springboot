package com.springboot.mall.model;

public class CmsPrefrenceAreaProductRelation {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long prefrenceAreaId;

    /**
     * 
     */
    private Long productId;

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
     * @return prefrence_area_id 
     */
    public Long getPrefrenceAreaId() {
        return prefrenceAreaId;
    }

    /**
     * 
     * @param prefrenceAreaId 
     */
    public void setPrefrenceAreaId(Long prefrenceAreaId) {
        this.prefrenceAreaId = prefrenceAreaId;
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
}