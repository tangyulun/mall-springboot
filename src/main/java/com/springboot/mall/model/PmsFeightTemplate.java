package com.springboot.mall.model;

import java.math.BigDecimal;

public class PmsFeightTemplate {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 计费类型:0->按重量；1->按件数
     */
    private Integer chargeType;

    /**
     * 首重kg
     */
    private BigDecimal firstWeight;

    /**
     * 首费（元）
     */
    private BigDecimal firstFee;

    /**
     * 
     */
    private BigDecimal continueWeight;

    /**
     * 
     */
    private BigDecimal continmeFee;

    /**
     * 目的地（省、市）
     */
    private String dest;

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
     * 计费类型:0->按重量；1->按件数
     * @return charge_type 计费类型:0->按重量；1->按件数
     */
    public Integer getChargeType() {
        return chargeType;
    }

    /**
     * 计费类型:0->按重量；1->按件数
     * @param chargeType 计费类型:0->按重量；1->按件数
     */
    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    /**
     * 首重kg
     * @return first_weight 首重kg
     */
    public BigDecimal getFirstWeight() {
        return firstWeight;
    }

    /**
     * 首重kg
     * @param firstWeight 首重kg
     */
    public void setFirstWeight(BigDecimal firstWeight) {
        this.firstWeight = firstWeight;
    }

    /**
     * 首费（元）
     * @return first_fee 首费（元）
     */
    public BigDecimal getFirstFee() {
        return firstFee;
    }

    /**
     * 首费（元）
     * @param firstFee 首费（元）
     */
    public void setFirstFee(BigDecimal firstFee) {
        this.firstFee = firstFee;
    }

    /**
     * 
     * @return continue_weight 
     */
    public BigDecimal getContinueWeight() {
        return continueWeight;
    }

    /**
     * 
     * @param continueWeight 
     */
    public void setContinueWeight(BigDecimal continueWeight) {
        this.continueWeight = continueWeight;
    }

    /**
     * 
     * @return continme_fee 
     */
    public BigDecimal getContinmeFee() {
        return continmeFee;
    }

    /**
     * 
     * @param continmeFee 
     */
    public void setContinmeFee(BigDecimal continmeFee) {
        this.continmeFee = continmeFee;
    }

    /**
     * 目的地（省、市）
     * @return dest 目的地（省、市）
     */
    public String getDest() {
        return dest;
    }

    /**
     * 目的地（省、市）
     * @param dest 目的地（省、市）
     */
    public void setDest(String dest) {
        this.dest = dest == null ? null : dest.trim();
    }
}