package com.springboot.mall.model;

import java.util.Date;

public class PmsComment {
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
    private String memberNickName;

    /**
     * 
     */
    private String productName;

    /**
     * 评价星数：0->5
     */
    private Integer star;

    /**
     * 评价的ip
     */
    private String memberIp;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Integer showStatus;

    /**
     * 购买时的商品属性
     */
    private String productAttribute;

    /**
     * 
     */
    private Integer collectCouont;

    /**
     * 
     */
    private Integer readCount;

    /**
     * 上传图片地址，以逗号隔开
     */
    private String pics;

    /**
     * 评论用户头像
     */
    private String memberIcon;

    /**
     * 
     */
    private Integer replayCount;

    /**
     * 
     */
    private String content;

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
     * @return member_nick_name 
     */
    public String getMemberNickName() {
        return memberNickName;
    }

    /**
     * 
     * @param memberNickName 
     */
    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName == null ? null : memberNickName.trim();
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
     * 评价星数：0->5
     * @return star 评价星数：0->5
     */
    public Integer getStar() {
        return star;
    }

    /**
     * 评价星数：0->5
     * @param star 评价星数：0->5
     */
    public void setStar(Integer star) {
        this.star = star;
    }

    /**
     * 评价的ip
     * @return member_ip 评价的ip
     */
    public String getMemberIp() {
        return memberIp;
    }

    /**
     * 评价的ip
     * @param memberIp 评价的ip
     */
    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp == null ? null : memberIp.trim();
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

    /**
     * 
     * @return show_status 
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 
     * @param showStatus 
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * 购买时的商品属性
     * @return product_attribute 购买时的商品属性
     */
    public String getProductAttribute() {
        return productAttribute;
    }

    /**
     * 购买时的商品属性
     * @param productAttribute 购买时的商品属性
     */
    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute == null ? null : productAttribute.trim();
    }

    /**
     * 
     * @return collect_couont 
     */
    public Integer getCollectCouont() {
        return collectCouont;
    }

    /**
     * 
     * @param collectCouont 
     */
    public void setCollectCouont(Integer collectCouont) {
        this.collectCouont = collectCouont;
    }

    /**
     * 
     * @return read_count 
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * 
     * @param readCount 
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    /**
     * 上传图片地址，以逗号隔开
     * @return pics 上传图片地址，以逗号隔开
     */
    public String getPics() {
        return pics;
    }

    /**
     * 上传图片地址，以逗号隔开
     * @param pics 上传图片地址，以逗号隔开
     */
    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    /**
     * 评论用户头像
     * @return member_icon 评论用户头像
     */
    public String getMemberIcon() {
        return memberIcon;
    }

    /**
     * 评论用户头像
     * @param memberIcon 评论用户头像
     */
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon == null ? null : memberIcon.trim();
    }

    /**
     * 
     * @return replay_count 
     */
    public Integer getReplayCount() {
        return replayCount;
    }

    /**
     * 
     * @param replayCount 
     */
    public void setReplayCount(Integer replayCount) {
        this.replayCount = replayCount;
    }

    /**
     * 
     * @return content 
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     * @param content 
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}