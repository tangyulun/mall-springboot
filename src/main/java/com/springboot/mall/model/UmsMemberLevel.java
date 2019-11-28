package com.springboot.mall.model;

import java.math.BigDecimal;

public class UmsMemberLevel {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer growthPoint;

    /**
     * 是否为默认等级：0->不是；1->是
     */
    private Integer defaultStatus;

    /**
     * 免运费标准
     */
    private BigDecimal freeFreightPoint;

    /**
     * 每次评价获取的成长值
     */
    private Integer commentGrowthPoint;

    /**
     * 是否有免邮特权
     */
    private Integer priviledgeFreeFreight;

    /**
     * 是否有签到特权
     */
    private Integer priviledgeSignIn;

    /**
     * 是否有评论获奖励特权
     */
    private Integer priviledgeComment;

    /**
     * 是否有专享活动特权
     */
    private Integer priviledgePromotion;

    /**
     * 是否有会员价格特权
     */
    private Integer priviledgeMemberPrice;

    /**
     * 是否有生日特权
     */
    private Integer priviledgeBirthday;

    /**
     * 
     */
    private String note;

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
     * 
     * @return growth_point 
     */
    public Integer getGrowthPoint() {
        return growthPoint;
    }

    /**
     * 
     * @param growthPoint 
     */
    public void setGrowthPoint(Integer growthPoint) {
        this.growthPoint = growthPoint;
    }

    /**
     * 是否为默认等级：0->不是；1->是
     * @return default_status 是否为默认等级：0->不是；1->是
     */
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    /**
     * 是否为默认等级：0->不是；1->是
     * @param defaultStatus 是否为默认等级：0->不是；1->是
     */
    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    /**
     * 免运费标准
     * @return free_freight_point 免运费标准
     */
    public BigDecimal getFreeFreightPoint() {
        return freeFreightPoint;
    }

    /**
     * 免运费标准
     * @param freeFreightPoint 免运费标准
     */
    public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    /**
     * 每次评价获取的成长值
     * @return comment_growth_point 每次评价获取的成长值
     */
    public Integer getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    /**
     * 每次评价获取的成长值
     * @param commentGrowthPoint 每次评价获取的成长值
     */
    public void setCommentGrowthPoint(Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    /**
     * 是否有免邮特权
     * @return priviledge_free_freight 是否有免邮特权
     */
    public Integer getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    /**
     * 是否有免邮特权
     * @param priviledgeFreeFreight 是否有免邮特权
     */
    public void setPriviledgeFreeFreight(Integer priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    /**
     * 是否有签到特权
     * @return priviledge_sign_in 是否有签到特权
     */
    public Integer getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    /**
     * 是否有签到特权
     * @param priviledgeSignIn 是否有签到特权
     */
    public void setPriviledgeSignIn(Integer priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    /**
     * 是否有评论获奖励特权
     * @return priviledge_comment 是否有评论获奖励特权
     */
    public Integer getPriviledgeComment() {
        return priviledgeComment;
    }

    /**
     * 是否有评论获奖励特权
     * @param priviledgeComment 是否有评论获奖励特权
     */
    public void setPriviledgeComment(Integer priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    /**
     * 是否有专享活动特权
     * @return priviledge_promotion 是否有专享活动特权
     */
    public Integer getPriviledgePromotion() {
        return priviledgePromotion;
    }

    /**
     * 是否有专享活动特权
     * @param priviledgePromotion 是否有专享活动特权
     */
    public void setPriviledgePromotion(Integer priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    /**
     * 是否有会员价格特权
     * @return priviledge_member_price 是否有会员价格特权
     */
    public Integer getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    /**
     * 是否有会员价格特权
     * @param priviledgeMemberPrice 是否有会员价格特权
     */
    public void setPriviledgeMemberPrice(Integer priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    /**
     * 是否有生日特权
     * @return priviledge_birthday 是否有生日特权
     */
    public Integer getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    /**
     * 是否有生日特权
     * @param priviledgeBirthday 是否有生日特权
     */
    public void setPriviledgeBirthday(Integer priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    /**
     * 
     * @return note 
     */
    public String getNote() {
        return note;
    }

    /**
     * 
     * @param note 
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}