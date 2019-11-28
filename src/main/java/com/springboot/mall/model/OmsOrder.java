package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class OmsOrder {
    /**
     * 订单id
     */
    private Long id;

    /**
     * 
     */
    private Long memberId;

    /**
     * 
     */
    private Long couponId;

    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * 提交时间
     */
    private Date createTime;

    /**
     * 用户帐号
     */
    private String memberUsername;

    /**
     * 订单总金额
     */
    private BigDecimal totalAmount;

    /**
     * 应付金额（实际支付金额）
     */
    private BigDecimal payAmount;

    /**
     * 运费金额
     */
    private BigDecimal freightAmount;

    /**
     * 促销优化金额（促销价、满减、阶梯价）
     */
    private BigDecimal promotionAmount;

    /**
     * 积分抵扣金额
     */
    private BigDecimal integrationAmount;

    /**
     * 优惠券抵扣金额
     */
    private BigDecimal couponAmount;

    /**
     * 管理员后台调整订单使用的折扣金额
     */
    private BigDecimal discountAmount;

    /**
     * 支付方式：0->未支付；1->支付宝；2->微信
     */
    private Integer payType;

    /**
     * 订单来源：0->PC订单；1->app订单
     */
    private Integer sourceType;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    private Integer status;

    /**
     * 订单类型：0->正常订单；1->秒杀订单
     */
    private Integer orderType;

    /**
     * 物流公司(配送方式)
     */
    private String deliveryCompany;

    /**
     * 物流单号
     */
    private String deliverySn;

    /**
     * 自动确认时间（天）
     */
    private Integer autoConfirmDay;

    /**
     * 可以获得的积分
     */
    private Integer integration;

    /**
     * 可以活动的成长值
     */
    private Integer growth;

    /**
     * 活动信息
     */
    private String promotionInfo;

    /**
     * 发票类型：0->不开发票；1->电子发票；2->纸质发票
     */
    private Integer billType;

    /**
     * 发票抬头
     */
    private String billHeader;

    /**
     * 发票内容
     */
    private String billContent;

    /**
     * 收票人电话
     */
    private String billReceiverPhone;

    /**
     * 收票人邮箱
     */
    private String billReceiverEmail;

    /**
     * 收货人姓名
     */
    private String receiverName;

    /**
     * 收货人电话
     */
    private String receiverPhone;

    /**
     * 收货人邮编
     */
    private String receiverPostCode;

    /**
     * 省份/直辖市
     */
    private String receiverProvince;

    /**
     * 城市
     */
    private String receiverCity;

    /**
     * 区
     */
    private String receiverRegion;

    /**
     * 详细地址
     */
    private String receiverDetailAddress;

    /**
     * 订单备注
     */
    private String note;

    /**
     * 确认收货状态：0->未确认；1->已确认
     */
    private Integer confirmStatus;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    private Integer deleteStatus;

    /**
     * 下单时使用的积分
     */
    private Integer useIntegration;

    /**
     * 支付时间
     */
    private Date paymentTime;

    /**
     * 发货时间
     */
    private Date deliveryTime;

    /**
     * 确认收货时间
     */
    private Date receiveTime;

    /**
     * 评价时间
     */
    private Date commentTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 订单id
     * @return id 订单id
     */
    public Long getId() {
        return id;
    }

    /**
     * 订单id
     * @param id 订单id
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
     * 
     * @return coupon_id 
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * 
     * @param couponId 
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * 订单编号
     * @return order_sn 订单编号
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * 订单编号
     * @param orderSn 订单编号
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     * 提交时间
     * @return create_time 提交时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 提交时间
     * @param createTime 提交时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 用户帐号
     * @return member_username 用户帐号
     */
    public String getMemberUsername() {
        return memberUsername;
    }

    /**
     * 用户帐号
     * @param memberUsername 用户帐号
     */
    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername == null ? null : memberUsername.trim();
    }

    /**
     * 订单总金额
     * @return total_amount 订单总金额
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 订单总金额
     * @param totalAmount 订单总金额
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 应付金额（实际支付金额）
     * @return pay_amount 应付金额（实际支付金额）
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * 应付金额（实际支付金额）
     * @param payAmount 应付金额（实际支付金额）
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * 运费金额
     * @return freight_amount 运费金额
     */
    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    /**
     * 运费金额
     * @param freightAmount 运费金额
     */
    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    /**
     * 促销优化金额（促销价、满减、阶梯价）
     * @return promotion_amount 促销优化金额（促销价、满减、阶梯价）
     */
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    /**
     * 促销优化金额（促销价、满减、阶梯价）
     * @param promotionAmount 促销优化金额（促销价、满减、阶梯价）
     */
    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    /**
     * 积分抵扣金额
     * @return integration_amount 积分抵扣金额
     */
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    /**
     * 积分抵扣金额
     * @param integrationAmount 积分抵扣金额
     */
    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    /**
     * 优惠券抵扣金额
     * @return coupon_amount 优惠券抵扣金额
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * 优惠券抵扣金额
     * @param couponAmount 优惠券抵扣金额
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 管理员后台调整订单使用的折扣金额
     * @return discount_amount 管理员后台调整订单使用的折扣金额
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * 管理员后台调整订单使用的折扣金额
     * @param discountAmount 管理员后台调整订单使用的折扣金额
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * 支付方式：0->未支付；1->支付宝；2->微信
     * @return pay_type 支付方式：0->未支付；1->支付宝；2->微信
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 支付方式：0->未支付；1->支付宝；2->微信
     * @param payType 支付方式：0->未支付；1->支付宝；2->微信
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 订单来源：0->PC订单；1->app订单
     * @return source_type 订单来源：0->PC订单；1->app订单
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * 订单来源：0->PC订单；1->app订单
     * @param sourceType 订单来源：0->PC订单；1->app订单
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     * @return status 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     * @param status 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 订单类型：0->正常订单；1->秒杀订单
     * @return order_type 订单类型：0->正常订单；1->秒杀订单
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 订单类型：0->正常订单；1->秒杀订单
     * @param orderType 订单类型：0->正常订单；1->秒杀订单
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 物流公司(配送方式)
     * @return delivery_company 物流公司(配送方式)
     */
    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    /**
     * 物流公司(配送方式)
     * @param deliveryCompany 物流公司(配送方式)
     */
    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany == null ? null : deliveryCompany.trim();
    }

    /**
     * 物流单号
     * @return delivery_sn 物流单号
     */
    public String getDeliverySn() {
        return deliverySn;
    }

    /**
     * 物流单号
     * @param deliverySn 物流单号
     */
    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn == null ? null : deliverySn.trim();
    }

    /**
     * 自动确认时间（天）
     * @return auto_confirm_day 自动确认时间（天）
     */
    public Integer getAutoConfirmDay() {
        return autoConfirmDay;
    }

    /**
     * 自动确认时间（天）
     * @param autoConfirmDay 自动确认时间（天）
     */
    public void setAutoConfirmDay(Integer autoConfirmDay) {
        this.autoConfirmDay = autoConfirmDay;
    }

    /**
     * 可以获得的积分
     * @return integration 可以获得的积分
     */
    public Integer getIntegration() {
        return integration;
    }

    /**
     * 可以获得的积分
     * @param integration 可以获得的积分
     */
    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    /**
     * 可以活动的成长值
     * @return growth 可以活动的成长值
     */
    public Integer getGrowth() {
        return growth;
    }

    /**
     * 可以活动的成长值
     * @param growth 可以活动的成长值
     */
    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    /**
     * 活动信息
     * @return promotion_info 活动信息
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    /**
     * 活动信息
     * @param promotionInfo 活动信息
     */
    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo == null ? null : promotionInfo.trim();
    }

    /**
     * 发票类型：0->不开发票；1->电子发票；2->纸质发票
     * @return bill_type 发票类型：0->不开发票；1->电子发票；2->纸质发票
     */
    public Integer getBillType() {
        return billType;
    }

    /**
     * 发票类型：0->不开发票；1->电子发票；2->纸质发票
     * @param billType 发票类型：0->不开发票；1->电子发票；2->纸质发票
     */
    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    /**
     * 发票抬头
     * @return bill_header 发票抬头
     */
    public String getBillHeader() {
        return billHeader;
    }

    /**
     * 发票抬头
     * @param billHeader 发票抬头
     */
    public void setBillHeader(String billHeader) {
        this.billHeader = billHeader == null ? null : billHeader.trim();
    }

    /**
     * 发票内容
     * @return bill_content 发票内容
     */
    public String getBillContent() {
        return billContent;
    }

    /**
     * 发票内容
     * @param billContent 发票内容
     */
    public void setBillContent(String billContent) {
        this.billContent = billContent == null ? null : billContent.trim();
    }

    /**
     * 收票人电话
     * @return bill_receiver_phone 收票人电话
     */
    public String getBillReceiverPhone() {
        return billReceiverPhone;
    }

    /**
     * 收票人电话
     * @param billReceiverPhone 收票人电话
     */
    public void setBillReceiverPhone(String billReceiverPhone) {
        this.billReceiverPhone = billReceiverPhone == null ? null : billReceiverPhone.trim();
    }

    /**
     * 收票人邮箱
     * @return bill_receiver_email 收票人邮箱
     */
    public String getBillReceiverEmail() {
        return billReceiverEmail;
    }

    /**
     * 收票人邮箱
     * @param billReceiverEmail 收票人邮箱
     */
    public void setBillReceiverEmail(String billReceiverEmail) {
        this.billReceiverEmail = billReceiverEmail == null ? null : billReceiverEmail.trim();
    }

    /**
     * 收货人姓名
     * @return receiver_name 收货人姓名
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 收货人姓名
     * @param receiverName 收货人姓名
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * 收货人电话
     * @return receiver_phone 收货人电话
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * 收货人电话
     * @param receiverPhone 收货人电话
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    /**
     * 收货人邮编
     * @return receiver_post_code 收货人邮编
     */
    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    /**
     * 收货人邮编
     * @param receiverPostCode 收货人邮编
     */
    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode == null ? null : receiverPostCode.trim();
    }

    /**
     * 省份/直辖市
     * @return receiver_province 省份/直辖市
     */
    public String getReceiverProvince() {
        return receiverProvince;
    }

    /**
     * 省份/直辖市
     * @param receiverProvince 省份/直辖市
     */
    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince == null ? null : receiverProvince.trim();
    }

    /**
     * 城市
     * @return receiver_city 城市
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * 城市
     * @param receiverCity 城市
     */
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity == null ? null : receiverCity.trim();
    }

    /**
     * 区
     * @return receiver_region 区
     */
    public String getReceiverRegion() {
        return receiverRegion;
    }

    /**
     * 区
     * @param receiverRegion 区
     */
    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion == null ? null : receiverRegion.trim();
    }

    /**
     * 详细地址
     * @return receiver_detail_address 详细地址
     */
    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    /**
     * 详细地址
     * @param receiverDetailAddress 详细地址
     */
    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress == null ? null : receiverDetailAddress.trim();
    }

    /**
     * 订单备注
     * @return note 订单备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 订单备注
     * @param note 订单备注
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * 确认收货状态：0->未确认；1->已确认
     * @return confirm_status 确认收货状态：0->未确认；1->已确认
     */
    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    /**
     * 确认收货状态：0->未确认；1->已确认
     * @param confirmStatus 确认收货状态：0->未确认；1->已确认
     */
    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    /**
     * 删除状态：0->未删除；1->已删除
     * @return delete_status 删除状态：0->未删除；1->已删除
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 删除状态：0->未删除；1->已删除
     * @param deleteStatus 删除状态：0->未删除；1->已删除
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * 下单时使用的积分
     * @return use_integration 下单时使用的积分
     */
    public Integer getUseIntegration() {
        return useIntegration;
    }

    /**
     * 下单时使用的积分
     * @param useIntegration 下单时使用的积分
     */
    public void setUseIntegration(Integer useIntegration) {
        this.useIntegration = useIntegration;
    }

    /**
     * 支付时间
     * @return payment_time 支付时间
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * 支付时间
     * @param paymentTime 支付时间
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * 发货时间
     * @return delivery_time 发货时间
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * 发货时间
     * @param deliveryTime 发货时间
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * 确认收货时间
     * @return receive_time 确认收货时间
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * 确认收货时间
     * @param receiveTime 确认收货时间
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * 评价时间
     * @return comment_time 评价时间
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * 评价时间
     * @param commentTime 评价时间
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * 修改时间
     * @return modify_time 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}