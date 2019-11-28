package com.springboot.mall.model;

import java.math.BigDecimal;

public class PmsSkuStock {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long productId;

    /**
     * sku编码
     */
    private String skuCode;

    /**
     * 
     */
    private BigDecimal price;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 预警库存
     */
    private Integer lowStock;

    /**
     * 销售属性1
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
     * 展示图片
     */
    private String pic;

    /**
     * 销量
     */
    private Integer sale;

    /**
     * 单品促销价格
     */
    private BigDecimal promotionPrice;

    /**
     * 锁定库存
     */
    private Integer lockStock;

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
     * sku编码
     * @return sku_code sku编码
     */
    public String getSkuCode() {
        return skuCode;
    }

    /**
     * sku编码
     * @param skuCode sku编码
     */
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    /**
     * 
     * @return price 
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 
     * @param price 
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 库存
     * @return stock 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 库存
     * @param stock 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 预警库存
     * @return low_stock 预警库存
     */
    public Integer getLowStock() {
        return lowStock;
    }

    /**
     * 预警库存
     * @param lowStock 预警库存
     */
    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    /**
     * 销售属性1
     * @return sp1 销售属性1
     */
    public String getSp1() {
        return sp1;
    }

    /**
     * 销售属性1
     * @param sp1 销售属性1
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
     * 展示图片
     * @return pic 展示图片
     */
    public String getPic() {
        return pic;
    }

    /**
     * 展示图片
     * @param pic 展示图片
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * 销量
     * @return sale 销量
     */
    public Integer getSale() {
        return sale;
    }

    /**
     * 销量
     * @param sale 销量
     */
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    /**
     * 单品促销价格
     * @return promotion_price 单品促销价格
     */
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * 单品促销价格
     * @param promotionPrice 单品促销价格
     */
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * 锁定库存
     * @return lock_stock 锁定库存
     */
    public Integer getLockStock() {
        return lockStock;
    }

    /**
     * 锁定库存
     * @param lockStock 锁定库存
     */
    public void setLockStock(Integer lockStock) {
        this.lockStock = lockStock;
    }
}