package com.springboot.mall.model;

public class SmsCouponProductCategoryRelation {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long couponId;

    /**
     * 
     */
    private Long productCategoryId;

    /**
     * 产品分类名称
     */
    private String productCategoryName;

    /**
     * 父分类名称
     */
    private String parentCategoryName;

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
     * @return coupon_id 
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * 
     * @param couponId 
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
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
     * 产品分类名称
     * @return product_category_name 产品分类名称
     */
    public String getProductCategoryName() {
        return productCategoryName;
    }

    /**
     * 产品分类名称
     * @param productCategoryName 产品分类名称
     */
    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName == null ? null : productCategoryName.trim();
    }

    /**
     * 父分类名称
     * @return parent_category_name 父分类名称
     */
    public String getParentCategoryName() {
        return parentCategoryName;
    }

    /**
     * 父分类名称
     * @param parentCategoryName 父分类名称
     */
    public void setParentCategoryName(String parentCategoryName) {
        this.parentCategoryName = parentCategoryName == null ? null : parentCategoryName.trim();
    }
}