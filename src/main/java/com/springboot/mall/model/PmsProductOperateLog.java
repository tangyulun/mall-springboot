package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class PmsProductOperateLog {
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
    private BigDecimal priceOld;

    /**
     * 
     */
    private BigDecimal priceNew;

    /**
     * 
     */
    private BigDecimal salePriceOld;

    /**
     * 
     */
    private BigDecimal salePriceNew;

    /**
     * 赠送的积分
     */
    private Integer giftPointOld;

    /**
     * 
     */
    private Integer giftPointNew;

    /**
     * 
     */
    private Integer usePointLimitOld;

    /**
     * 
     */
    private Integer usePointLimitNew;

    /**
     * 操作人
     */
    private String operateMan;

    /**
     * 
     */
    private Date createTime;

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
     * @return price_old 
     */
    public BigDecimal getPriceOld() {
        return priceOld;
    }

    /**
     * 
     * @param priceOld 
     */
    public void setPriceOld(BigDecimal priceOld) {
        this.priceOld = priceOld;
    }

    /**
     * 
     * @return price_new 
     */
    public BigDecimal getPriceNew() {
        return priceNew;
    }

    /**
     * 
     * @param priceNew 
     */
    public void setPriceNew(BigDecimal priceNew) {
        this.priceNew = priceNew;
    }

    /**
     * 
     * @return sale_price_old 
     */
    public BigDecimal getSalePriceOld() {
        return salePriceOld;
    }

    /**
     * 
     * @param salePriceOld 
     */
    public void setSalePriceOld(BigDecimal salePriceOld) {
        this.salePriceOld = salePriceOld;
    }

    /**
     * 
     * @return sale_price_new 
     */
    public BigDecimal getSalePriceNew() {
        return salePriceNew;
    }

    /**
     * 
     * @param salePriceNew 
     */
    public void setSalePriceNew(BigDecimal salePriceNew) {
        this.salePriceNew = salePriceNew;
    }

    /**
     * 赠送的积分
     * @return gift_point_old 赠送的积分
     */
    public Integer getGiftPointOld() {
        return giftPointOld;
    }

    /**
     * 赠送的积分
     * @param giftPointOld 赠送的积分
     */
    public void setGiftPointOld(Integer giftPointOld) {
        this.giftPointOld = giftPointOld;
    }

    /**
     * 
     * @return gift_point_new 
     */
    public Integer getGiftPointNew() {
        return giftPointNew;
    }

    /**
     * 
     * @param giftPointNew 
     */
    public void setGiftPointNew(Integer giftPointNew) {
        this.giftPointNew = giftPointNew;
    }

    /**
     * 
     * @return use_point_limit_old 
     */
    public Integer getUsePointLimitOld() {
        return usePointLimitOld;
    }

    /**
     * 
     * @param usePointLimitOld 
     */
    public void setUsePointLimitOld(Integer usePointLimitOld) {
        this.usePointLimitOld = usePointLimitOld;
    }

    /**
     * 
     * @return use_point_limit_new 
     */
    public Integer getUsePointLimitNew() {
        return usePointLimitNew;
    }

    /**
     * 
     * @param usePointLimitNew 
     */
    public void setUsePointLimitNew(Integer usePointLimitNew) {
        this.usePointLimitNew = usePointLimitNew;
    }

    /**
     * 操作人
     * @return operate_man 操作人
     */
    public String getOperateMan() {
        return operateMan;
    }

    /**
     * 操作人
     * @param operateMan 操作人
     */
    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan == null ? null : operateMan.trim();
    }

    /**
     * 
     * @return create_time 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}