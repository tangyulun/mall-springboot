package com.springboot.mall.model;

public class UmsIntegrationConsumeSetting {
    /**
     * 
     */
    private Long id;

    /**
     * 每一元需要抵扣的积分数量
     */
    private Integer deductionPerAmount;

    /**
     * 每笔订单最高抵用百分比
     */
    private Integer maxPercentPerOrder;

    /**
     * 每次使用积分最小单位100
     */
    private Integer useUnit;

    /**
     * 是否可以和优惠券同用；0->不可以；1->可以
     */
    private Integer couponStatus;

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
     * 每一元需要抵扣的积分数量
     * @return deduction_per_amount 每一元需要抵扣的积分数量
     */
    public Integer getDeductionPerAmount() {
        return deductionPerAmount;
    }

    /**
     * 每一元需要抵扣的积分数量
     * @param deductionPerAmount 每一元需要抵扣的积分数量
     */
    public void setDeductionPerAmount(Integer deductionPerAmount) {
        this.deductionPerAmount = deductionPerAmount;
    }

    /**
     * 每笔订单最高抵用百分比
     * @return max_percent_per_order 每笔订单最高抵用百分比
     */
    public Integer getMaxPercentPerOrder() {
        return maxPercentPerOrder;
    }

    /**
     * 每笔订单最高抵用百分比
     * @param maxPercentPerOrder 每笔订单最高抵用百分比
     */
    public void setMaxPercentPerOrder(Integer maxPercentPerOrder) {
        this.maxPercentPerOrder = maxPercentPerOrder;
    }

    /**
     * 每次使用积分最小单位100
     * @return use_unit 每次使用积分最小单位100
     */
    public Integer getUseUnit() {
        return useUnit;
    }

    /**
     * 每次使用积分最小单位100
     * @param useUnit 每次使用积分最小单位100
     */
    public void setUseUnit(Integer useUnit) {
        this.useUnit = useUnit;
    }

    /**
     * 是否可以和优惠券同用；0->不可以；1->可以
     * @return coupon_status 是否可以和优惠券同用；0->不可以；1->可以
     */
    public Integer getCouponStatus() {
        return couponStatus;
    }

    /**
     * 是否可以和优惠券同用；0->不可以；1->可以
     * @param couponStatus 是否可以和优惠券同用；0->不可以；1->可以
     */
    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }
}