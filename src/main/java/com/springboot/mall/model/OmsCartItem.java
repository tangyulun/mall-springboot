package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class OmsCartItem {
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
    private Long productSkuId;

    /**
     * 
     */
    private Long memberId;

    /**
     * 购买数量
     */
    private Integer quantity;

    /**
     * 添加到购物车的价格
     */
    private BigDecimal price;

    /**
     * 销售属性1
     */
    private String sp1;

    /**
     * 销售属性2
     */
    private String sp2;

    /**
     * 销售属性3
     */
    private String sp3;

    /**
     * 商品主图
     */
    private String productPic;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品副标题（卖点）
     */
    private String productSubTitle;

    /**
     * 商品sku条码
     */
    private String productSkuCode;

    /**
     * 会员昵称
     */
    private String memberNickname;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date modifyDate;

    /**
     * 是否删除
     */
    private Integer deleteStatus;

    /**
     * 商品分类
     */
    private Long productCategoryId;

    /**
     * 
     */
    private String productBrand;

    /**
     * 
     */
    private String productSn;

    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    private String productAttr;

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
     * @return product_sku_id 
     */
    public Long getProductSkuId() {
        return productSkuId;
    }

    /**
     * 
     * @param productSkuId 
     */
    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
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
     * 购买数量
     * @return quantity 购买数量
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 购买数量
     * @param quantity 购买数量
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 添加到购物车的价格
     * @return price 添加到购物车的价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 添加到购物车的价格
     * @param price 添加到购物车的价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 销售属性1
     * @return sp1 销售属性1
     */
    public String getSp1() {
        return sp1;
    }

    /**
     * 销售属性1
     * @param sp1 销售属性1
     */
    public void setSp1(String sp1) {
        this.sp1 = sp1 == null ? null : sp1.trim();
    }

    /**
     * 销售属性2
     * @return sp2 销售属性2
     */
    public String getSp2() {
        return sp2;
    }

    /**
     * 销售属性2
     * @param sp2 销售属性2
     */
    public void setSp2(String sp2) {
        this.sp2 = sp2 == null ? null : sp2.trim();
    }

    /**
     * 销售属性3
     * @return sp3 销售属性3
     */
    public String getSp3() {
        return sp3;
    }

    /**
     * 销售属性3
     * @param sp3 销售属性3
     */
    public void setSp3(String sp3) {
        this.sp3 = sp3 == null ? null : sp3.trim();
    }

    /**
     * 商品主图
     * @return product_pic 商品主图
     */
    public String getProductPic() {
        return productPic;
    }

    /**
     * 商品主图
     * @param productPic 商品主图
     */
    public void setProductPic(String productPic) {
        this.productPic = productPic == null ? null : productPic.trim();
    }

    /**
     * 商品名称
     * @return product_name 商品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 商品名称
     * @param productName 商品名称
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 商品副标题（卖点）
     * @return product_sub_title 商品副标题（卖点）
     */
    public String getProductSubTitle() {
        return productSubTitle;
    }

    /**
     * 商品副标题（卖点）
     * @param productSubTitle 商品副标题（卖点）
     */
    public void setProductSubTitle(String productSubTitle) {
        this.productSubTitle = productSubTitle == null ? null : productSubTitle.trim();
    }

    /**
     * 商品sku条码
     * @return product_sku_code 商品sku条码
     */
    public String getProductSkuCode() {
        return productSkuCode;
    }

    /**
     * 商品sku条码
     * @param productSkuCode 商品sku条码
     */
    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode == null ? null : productSkuCode.trim();
    }

    /**
     * 会员昵称
     * @return member_nickname 会员昵称
     */
    public String getMemberNickname() {
        return memberNickname;
    }

    /**
     * 会员昵称
     * @param memberNickname 会员昵称
     */
    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname == null ? null : memberNickname.trim();
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 修改时间
     * @return modify_date 修改时间
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * 修改时间
     * @param modifyDate 修改时间
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * 是否删除
     * @return delete_status 是否删除
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 是否删除
     * @param deleteStatus 是否删除
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * 商品分类
     * @return product_category_id 商品分类
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * 商品分类
     * @param productCategoryId 商品分类
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * 
     * @return product_brand 
     */
    public String getProductBrand() {
        return productBrand;
    }

    /**
     * 
     * @param productBrand 
     */
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand == null ? null : productBrand.trim();
    }

    /**
     * 
     * @return product_sn 
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * 
     * @param productSn 
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     * @return product_attr 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    public String getProductAttr() {
        return productAttr;
    }

    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     * @param productAttr 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr == null ? null : productAttr.trim();
    }
}