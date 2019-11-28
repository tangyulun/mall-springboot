package com.springboot.mall.model;

import java.math.BigDecimal;

public class UmsMemberRuleSetting {
    /**
     * 
     */
    private Long id;

    /**
     * 连续签到天数
     */
    private Integer continueSignDay;

    /**
     * 连续签到赠送数量
     */
    private Integer continueSignPoint;

    /**
     * 每消费多少元获取1个点
     */
    private BigDecimal consumePerPoint;

    /**
     * 最低获取点数的订单金额
     */
    private BigDecimal lowOrderAmount;

    /**
     * 每笔订单最高获取点数
     */
    private Integer maxPointPerOrder;

    /**
     * 类型：0->积分规则；1->成长值规则
     */
    private Integer type;

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
     * 连续签到天数
     * @return continue_sign_day 连续签到天数
     */
    public Integer getContinueSignDay() {
        return continueSignDay;
    }

    /**
     * 连续签到天数
     * @param continueSignDay 连续签到天数
     */
    public void setContinueSignDay(Integer continueSignDay) {
        this.continueSignDay = continueSignDay;
    }

    /**
     * 连续签到赠送数量
     * @return continue_sign_point 连续签到赠送数量
     */
    public Integer getContinueSignPoint() {
        return continueSignPoint;
    }

    /**
     * 连续签到赠送数量
     * @param continueSignPoint 连续签到赠送数量
     */
    public void setContinueSignPoint(Integer continueSignPoint) {
        this.continueSignPoint = continueSignPoint;
    }

    /**
     * 每消费多少元获取1个点
     * @return consume_per_point 每消费多少元获取1个点
     */
    public BigDecimal getConsumePerPoint() {
        return consumePerPoint;
    }

    /**
     * 每消费多少元获取1个点
     * @param consumePerPoint 每消费多少元获取1个点
     */
    public void setConsumePerPoint(BigDecimal consumePerPoint) {
        this.consumePerPoint = consumePerPoint;
    }

    /**
     * 最低获取点数的订单金额
     * @return low_order_amount 最低获取点数的订单金额
     */
    public BigDecimal getLowOrderAmount() {
        return lowOrderAmount;
    }

    /**
     * 最低获取点数的订单金额
     * @param lowOrderAmount 最低获取点数的订单金额
     */
    public void setLowOrderAmount(BigDecimal lowOrderAmount) {
        this.lowOrderAmount = lowOrderAmount;
    }

    /**
     * 每笔订单最高获取点数
     * @return max_point_per_order 每笔订单最高获取点数
     */
    public Integer getMaxPointPerOrder() {
        return maxPointPerOrder;
    }

    /**
     * 每笔订单最高获取点数
     * @param maxPointPerOrder 每笔订单最高获取点数
     */
    public void setMaxPointPerOrder(Integer maxPointPerOrder) {
        this.maxPointPerOrder = maxPointPerOrder;
    }

    /**
     * 类型：0->积分规则；1->成长值规则
     * @return type 类型：0->积分规则；1->成长值规则
     */
    public Integer getType() {
        return type;
    }

    /**
     * 类型：0->积分规则；1->成长值规则
     * @param type 类型：0->积分规则；1->成长值规则
     */
    public void setType(Integer type) {
        this.type = type;
    }
}