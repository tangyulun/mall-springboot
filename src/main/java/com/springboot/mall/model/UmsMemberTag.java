package com.springboot.mall.model;

import java.math.BigDecimal;

public class UmsMemberTag {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 自动打标签完成订单数量
     */
    private Integer finishOrderCount;

    /**
     * 自动打标签完成订单金额
     */
    private BigDecimal finishOrderAmount;

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
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 自动打标签完成订单数量
     * @return finish_order_count 自动打标签完成订单数量
     */
    public Integer getFinishOrderCount() {
        return finishOrderCount;
    }

    /**
     * 自动打标签完成订单数量
     * @param finishOrderCount 自动打标签完成订单数量
     */
    public void setFinishOrderCount(Integer finishOrderCount) {
        this.finishOrderCount = finishOrderCount;
    }

    /**
     * 自动打标签完成订单金额
     * @return finish_order_amount 自动打标签完成订单金额
     */
    public BigDecimal getFinishOrderAmount() {
        return finishOrderAmount;
    }

    /**
     * 自动打标签完成订单金额
     * @param finishOrderAmount 自动打标签完成订单金额
     */
    public void setFinishOrderAmount(BigDecimal finishOrderAmount) {
        this.finishOrderAmount = finishOrderAmount;
    }
}