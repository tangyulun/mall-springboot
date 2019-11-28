package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class UmsMemberStatisticsInfo {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long memberId;

    /**
     * 累计消费金额
     */
    private BigDecimal consumeAmount;

    /**
     * 订单数量
     */
    private Integer orderCount;

    /**
     * 优惠券数量
     */
    private Integer couponCount;

    /**
     * 评价数
     */
    private Integer commentCount;

    /**
     * 退货数量
     */
    private Integer returnOrderCount;

    /**
     * 登录次数
     */
    private Integer loginCount;

    /**
     * 关注数量
     */
    private Integer attendCount;

    /**
     * 粉丝数量
     */
    private Integer fansCount;

    /**
     * 
     */
    private Integer collectProductCount;

    /**
     * 
     */
    private Integer collectSubjectCount;

    /**
     * 
     */
    private Integer collectTopicCount;

    /**
     * 
     */
    private Integer collectCommentCount;

    /**
     * 
     */
    private Integer inviteFriendCount;

    /**
     * 最后一次下订单时间
     */
    private Date recentOrderTime;

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
     * @return member_id 
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * 
     * @param memberId 
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 累计消费金额
     * @return consume_amount 累计消费金额
     */
    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    /**
     * 累计消费金额
     * @param consumeAmount 累计消费金额
     */
    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    /**
     * 订单数量
     * @return order_count 订单数量
     */
    public Integer getOrderCount() {
        return orderCount;
    }

    /**
     * 订单数量
     * @param orderCount 订单数量
     */
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * 优惠券数量
     * @return coupon_count 优惠券数量
     */
    public Integer getCouponCount() {
        return couponCount;
    }

    /**
     * 优惠券数量
     * @param couponCount 优惠券数量
     */
    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    /**
     * 评价数
     * @return comment_count 评价数
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * 评价数
     * @param commentCount 评价数
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 退货数量
     * @return return_order_count 退货数量
     */
    public Integer getReturnOrderCount() {
        return returnOrderCount;
    }

    /**
     * 退货数量
     * @param returnOrderCount 退货数量
     */
    public void setReturnOrderCount(Integer returnOrderCount) {
        this.returnOrderCount = returnOrderCount;
    }

    /**
     * 登录次数
     * @return login_count 登录次数
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * 登录次数
     * @param loginCount 登录次数
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * 关注数量
     * @return attend_count 关注数量
     */
    public Integer getAttendCount() {
        return attendCount;
    }

    /**
     * 关注数量
     * @param attendCount 关注数量
     */
    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    /**
     * 粉丝数量
     * @return fans_count 粉丝数量
     */
    public Integer getFansCount() {
        return fansCount;
    }

    /**
     * 粉丝数量
     * @param fansCount 粉丝数量
     */
    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * 
     * @return collect_product_count 
     */
    public Integer getCollectProductCount() {
        return collectProductCount;
    }

    /**
     * 
     * @param collectProductCount 
     */
    public void setCollectProductCount(Integer collectProductCount) {
        this.collectProductCount = collectProductCount;
    }

    /**
     * 
     * @return collect_subject_count 
     */
    public Integer getCollectSubjectCount() {
        return collectSubjectCount;
    }

    /**
     * 
     * @param collectSubjectCount 
     */
    public void setCollectSubjectCount(Integer collectSubjectCount) {
        this.collectSubjectCount = collectSubjectCount;
    }

    /**
     * 
     * @return collect_topic_count 
     */
    public Integer getCollectTopicCount() {
        return collectTopicCount;
    }

    /**
     * 
     * @param collectTopicCount 
     */
    public void setCollectTopicCount(Integer collectTopicCount) {
        this.collectTopicCount = collectTopicCount;
    }

    /**
     * 
     * @return collect_comment_count 
     */
    public Integer getCollectCommentCount() {
        return collectCommentCount;
    }

    /**
     * 
     * @param collectCommentCount 
     */
    public void setCollectCommentCount(Integer collectCommentCount) {
        this.collectCommentCount = collectCommentCount;
    }

    /**
     * 
     * @return invite_friend_count 
     */
    public Integer getInviteFriendCount() {
        return inviteFriendCount;
    }

    /**
     * 
     * @param inviteFriendCount 
     */
    public void setInviteFriendCount(Integer inviteFriendCount) {
        this.inviteFriendCount = inviteFriendCount;
    }

    /**
     * 最后一次下订单时间
     * @return recent_order_time 最后一次下订单时间
     */
    public Date getRecentOrderTime() {
        return recentOrderTime;
    }

    /**
     * 最后一次下订单时间
     * @param recentOrderTime 最后一次下订单时间
     */
    public void setRecentOrderTime(Date recentOrderTime) {
        this.recentOrderTime = recentOrderTime;
    }
}