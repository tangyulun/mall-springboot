package com.springboot.mall.model;

import java.util.Date;

public class SmsFlashPromotionLog {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer memberId;

    /**
     * 
     */
    private Long productId;

    /**
     * 
     */
    private String memberPhone;

    /**
     * 
     */
    private String productName;

    /**
     * 会员订阅时间
     */
    private Date subscribeTime;

    /**
     * 
     */
    private Date sendTime;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return member_id 
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 
     * @param memberId 
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
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
     * @return member_phone 
     */
    public String getMemberPhone() {
        return memberPhone;
    }

    /**
     * 
     * @param memberPhone 
     */
    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone == null ? null : memberPhone.trim();
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
     * 会员订阅时间
     * @return subscribe_time 会员订阅时间
     */
    public Date getSubscribeTime() {
        return subscribeTime;
    }

    /**
     * 会员订阅时间
     * @param subscribeTime 会员订阅时间
     */
    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    /**
     * 
     * @return send_time 
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 
     * @param sendTime 
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}