package com.springboot.mall.model;

import java.math.BigDecimal;

public class OmsOrderItem {
    /**
     * 
     */
    private Long id;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * 
     */
    private Long productId;

    /**
     * 
     */
    private String productPic;

    /**
     * 
     */
    private String productName;

    /**
     * 
     */
    private String productBrand;

    /**
     * 
     */
    private String productSn;

    /**
     * 销售价格
     */
    private BigDecimal productPrice;

    /**
     * 购买数量
     */
    private Integer productQuantity;

    /**
     * 商品sku编号
     */
    private Long productSkuId;

    /**
     * 商品sku条码
     */
    private String productSkuCode;

    /**
     * 商品分类id
     */
    private Long productCategoryId;

    /**
     * 商品的销售属性
     */
    private String sp1;

    /**
     * 
     */
    private String sp2;

    /**
     * 
     */
    private String sp3;

    /**
     * 商品促销名称
     */
    private String promotionName;

    /**
     * 商品促销分解金额
     */
    private BigDecimal promotionAmount;

    /**
     * 优惠券优惠分解金额
     */
    private BigDecimal couponAmount;

    /**
     * 积分优惠分解金额
     */
    private BigDecimal integrationAmount;

    /**
     * 该商品经过优惠后的分解金额
     */
    private BigDecimal realAmount;

    /**
     * 
     */
    private Integer giftIntegration;

    /**
     * 
     */
    private Integer giftGrowth;

    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    private String productAttr;

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
     * 订单id
     * @return order_id 订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 订单id
     * @param orderId 订单id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 订单编号
     * @return order_sn 订单编号
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * 订单编号
     * @param orderSn 订单编号
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
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
     * @return product_pic 
     */
    public String getProductPic() {
        return productPic;
    }

    /**
     * 
     * @param productPic 
     */
    public void setProductPic(String productPic) {
        this.productPic = productPic == null ? null : productPic.trim();
    }

    /**
     * 
     * @return product_name 
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 
     * @param productName 
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 
     * @return product_brand 
     */
    public String getProductBrand() {
        return productBrand;
    }

    /**
     * 
     * @param productBrand 
     */
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand == null ? null : productBrand.trim();
    }

    /**
     * 
     * @return product_sn 
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * 
     * @param productSn 
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    /**
     * 销售价格
     * @return product_price 销售价格
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * 销售价格
     * @param productPrice 销售价格
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * 购买数量
     * @return product_quantity 购买数量
     */
    public Integer getProductQuantity() {
        return productQuantity;
    }

    /**
     * 购买数量
     * @param productQuantity 购买数量
     */
    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    /**
     * 商品sku编号
     * @return product_sku_id 商品sku编号
     */
    public Long getProductSkuId() {
        return productSkuId;
    }

    /**
     * 商品sku编号
     * @param productSkuId 商品sku编号
     */
    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
    }

    /**
     * 商品sku条码
     * @return product_sku_code 商品sku条码
     */
    public String getProductSkuCode() {
        return productSkuCode;
    }

    /**
     * 商品sku条码
     * @param productSkuCode 商品sku条码
     */
    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode == null ? null : productSkuCode.trim();
    }

    /**
     * 商品分类id
     * @return product_category_id 商品分类id
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * 商品分类id
     * @param productCategoryId 商品分类id
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * 商品的销售属性
     * @return sp1 商品的销售属性
     */
    public String getSp1() {
        return sp1;
    }

    /**
     * 商品的销售属性
     * @param sp1 商品的销售属性
     */
    public void setSp1(String sp1) {
        this.sp1 = sp1 == null ? null : sp1.trim();
    }

    /**
     * 
     * @return sp2 
     */
    public String getSp2() {
        return sp2;
    }

    /**
     * 
     * @param sp2 
     */
    public void setSp2(String sp2) {
        this.sp2 = sp2 == null ? null : sp2.trim();
    }

    /**
     * 
     * @return sp3 
     */
    public String getSp3() {
        return sp3;
    }

    /**
     * 
     * @param sp3 
     */
    public void setSp3(String sp3) {
        this.sp3 = sp3 == null ? null : sp3.trim();
    }

    /**
     * 商品促销名称
     * @return promotion_name 商品促销名称
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * 商品促销名称
     * @param promotionName 商品促销名称
     */
    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName == null ? null : promotionName.trim();
    }

    /**
     * 商品促销分解金额
     * @return promotion_amount 商品促销分解金额
     */
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    /**
     * 商品促销分解金额
     * @param promotionAmount 商品促销分解金额
     */
    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    /**
     * 优惠券优惠分解金额
     * @return coupon_amount 优惠券优惠分解金额
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * 优惠券优惠分解金额
     * @param couponAmount 优惠券优惠分解金额
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 积分优惠分解金额
     * @return integration_amount 积分优惠分解金额
     */
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    /**
     * 积分优惠分解金额
     * @param integrationAmount 积分优惠分解金额
     */
    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    /**
     * 该商品经过优惠后的分解金额
     * @return real_amount 该商品经过优惠后的分解金额
     */
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    /**
     * 该商品经过优惠后的分解金额
     * @param realAmount 该商品经过优惠后的分解金额
     */
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * 
     * @return gift_integration 
     */
    public Integer getGiftIntegration() {
        return giftIntegration;
    }

    /**
     * 
     * @param giftIntegration 
     */
    public void setGiftIntegration(Integer giftIntegration) {
        this.giftIntegration = giftIntegration;
    }

    /**
     * 
     * @return gift_growth 
     */
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    /**
     * 
     * @param giftGrowth 
     */
    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     * @return product_attr 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    public String getProductAttr() {
        return productAttr;
    }

    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     * @param productAttr 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr == null ? null : productAttr.trim();
    }
}