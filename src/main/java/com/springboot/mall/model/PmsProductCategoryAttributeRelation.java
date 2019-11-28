package com.springboot.mall.model;

public class PmsProductCategoryAttributeRelation {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long productCategoryId;

    /**
     * 
     */
    private Long productAttributeId;

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
     * @return product_category_id 
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * 
     * @param productCategoryId 
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * 
     * @return product_attribute_id 
     */
    public Long getProductAttributeId() {
        return productAttributeId;
    }

    /**
     * 
     * @param productAttributeId 
     */
    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }
}