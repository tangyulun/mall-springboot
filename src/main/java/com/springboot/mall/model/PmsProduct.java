package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class PmsProduct {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long brandId;

    /**
     * 
     */
    private Long productCategoryId;

    /**
     * 
     */
    private Long feightTemplateId;

    /**
     * 
     */
    private Long productAttributeCategoryId;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String pic;

    /**
     * 货号
     */
    private String productSn;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    private Integer deleteStatus;

    /**
     * 上架状态：0->下架；1->上架
     */
    private Integer publishStatus;

    /**
     * 新品状态:0->不是新品；1->新品
     */
    private Integer newStatus;

    /**
     * 推荐状态；0->不推荐；1->推荐
     */
    private Integer recommandStatus;

    /**
     * 审核状态：0->未审核；1->审核通过
     */
    private Integer verifyStatus;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 销量
     */
    private Integer sale;

    /**
     * 
     */
    private BigDecimal price;

    /**
     * 促销价格
     */
    private BigDecimal promotionPrice;

    /**
     * 赠送的成长值
     */
    private Integer giftGrowth;

    /**
     * 赠送的积分
     */
    private Integer giftPoint;

    /**
     * 限制使用的积分数
     */
    private Integer usePointLimit;

    /**
     * 副标题
     */
    private String subTitle;

    /**
     * 市场价
     */
    private BigDecimal originalPrice;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 库存预警值
     */
    private Integer lowStock;

    /**
     * 单位
     */
    private String unit;

    /**
     * 商品重量，默认为克
     */
    private BigDecimal weight;

    /**
     * 是否为预告商品：0->不是；1->是
     */
    private Integer previewStatus;

    /**
     * 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    private String serviceIds;

    /**
     * 
     */
    private String keywords;

    /**
     * 
     */
    private String note;

    /**
     * 画册图片，连产品图片限制为5张，以逗号分割
     */
    private String albumPics;

    /**
     * 
     */
    private String detailTitle;

    /**
     * 促销开始时间
     */
    private Date promotionStartTime;

    /**
     * 促销结束时间
     */
    private Date promotionEndTime;

    /**
     * 活动限购数量
     */
    private Integer promotionPerLimit;

    /**
     * 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     */
    private Integer promotionType;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 商品分类名称
     */
    private String productCategoryName;

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
     * @return brand_id 
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * 
     * @param brandId 
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * 
     * @return product_category_id 
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * 
     * @param productCategoryId 
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * 
     * @return feight_template_id 
     */
    public Long getFeightTemplateId() {
        return feightTemplateId;
    }

    /**
     * 
     * @param feightTemplateId 
     */
    public void setFeightTemplateId(Long feightTemplateId) {
        this.feightTemplateId = feightTemplateId;
    }

    /**
     * 
     * @return product_attribute_category_id 
     */
    public Long getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    /**
     * 
     * @param productAttributeCategoryId 
     */
    public void setProductAttributeCategoryId(Long productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
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
     * @return pic 
     */
    public String getPic() {
        return pic;
    }

    /**
     * 
     * @param pic 
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * 货号
     * @return product_sn 货号
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * 货号
     * @param productSn 货号
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
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
     * 上架状态：0->下架；1->上架
     * @return publish_status 上架状态：0->下架；1->上架
     */
    public Integer getPublishStatus() {
        return publishStatus;
    }

    /**
     * 上架状态：0->下架；1->上架
     * @param publishStatus 上架状态：0->下架；1->上架
     */
    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * 新品状态:0->不是新品；1->新品
     * @return new_status 新品状态:0->不是新品；1->新品
     */
    public Integer getNewStatus() {
        return newStatus;
    }

    /**
     * 新品状态:0->不是新品；1->新品
     * @param newStatus 新品状态:0->不是新品；1->新品
     */
    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    /**
     * 推荐状态；0->不推荐；1->推荐
     * @return recommand_status 推荐状态；0->不推荐；1->推荐
     */
    public Integer getRecommandStatus() {
        return recommandStatus;
    }

    /**
     * 推荐状态；0->不推荐；1->推荐
     * @param recommandStatus 推荐状态；0->不推荐；1->推荐
     */
    public void setRecommandStatus(Integer recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    /**
     * 审核状态：0->未审核；1->审核通过
     * @return verify_status 审核状态：0->未审核；1->审核通过
     */
    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    /**
     * 审核状态：0->未审核；1->审核通过
     * @param verifyStatus 审核状态：0->未审核；1->审核通过
     */
    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    /**
     * 排序
     * @return sort 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 销量
     * @return sale 销量
     */
    public Integer getSale() {
        return sale;
    }

    /**
     * 销量
     * @param sale 销量
     */
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    /**
     * 
     * @return price 
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 
     * @param price 
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 促销价格
     * @return promotion_price 促销价格
     */
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * 促销价格
     * @param promotionPrice 促销价格
     */
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * 赠送的成长值
     * @return gift_growth 赠送的成长值
     */
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    /**
     * 赠送的成长值
     * @param giftGrowth 赠送的成长值
     */
    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    /**
     * 赠送的积分
     * @return gift_point 赠送的积分
     */
    public Integer getGiftPoint() {
        return giftPoint;
    }

    /**
     * 赠送的积分
     * @param giftPoint 赠送的积分
     */
    public void setGiftPoint(Integer giftPoint) {
        this.giftPoint = giftPoint;
    }

    /**
     * 限制使用的积分数
     * @return use_point_limit 限制使用的积分数
     */
    public Integer getUsePointLimit() {
        return usePointLimit;
    }

    /**
     * 限制使用的积分数
     * @param usePointLimit 限制使用的积分数
     */
    public void setUsePointLimit(Integer usePointLimit) {
        this.usePointLimit = usePointLimit;
    }

    /**
     * 副标题
     * @return sub_title 副标题
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * 副标题
     * @param subTitle 副标题
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    /**
     * 市场价
     * @return original_price 市场价
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 市场价
     * @param originalPrice 市场价
     */
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * 库存
     * @return stock 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 库存
     * @param stock 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 库存预警值
     * @return low_stock 库存预警值
     */
    public Integer getLowStock() {
        return lowStock;
    }

    /**
     * 库存预警值
     * @param lowStock 库存预警值
     */
    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    /**
     * 单位
     * @return unit 单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 单位
     * @param unit 单位
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 商品重量，默认为克
     * @return weight 商品重量，默认为克
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 商品重量，默认为克
     * @param weight 商品重量，默认为克
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 是否为预告商品：0->不是；1->是
     * @return preview_status 是否为预告商品：0->不是；1->是
     */
    public Integer getPreviewStatus() {
        return previewStatus;
    }

    /**
     * 是否为预告商品：0->不是；1->是
     * @param previewStatus 是否为预告商品：0->不是；1->是
     */
    public void setPreviewStatus(Integer previewStatus) {
        this.previewStatus = previewStatus;
    }

    /**
     * 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     * @return service_ids 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    public String getServiceIds() {
        return serviceIds;
    }

    /**
     * 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     * @param serviceIds 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    public void setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds == null ? null : serviceIds.trim();
    }

    /**
     * 
     * @return keywords 
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 
     * @param keywords 
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
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

    /**
     * 画册图片，连产品图片限制为5张，以逗号分割
     * @return album_pics 画册图片，连产品图片限制为5张，以逗号分割
     */
    public String getAlbumPics() {
        return albumPics;
    }

    /**
     * 画册图片，连产品图片限制为5张，以逗号分割
     * @param albumPics 画册图片，连产品图片限制为5张，以逗号分割
     */
    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics == null ? null : albumPics.trim();
    }

    /**
     * 
     * @return detail_title 
     */
    public String getDetailTitle() {
        return detailTitle;
    }

    /**
     * 
     * @param detailTitle 
     */
    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle == null ? null : detailTitle.trim();
    }

    /**
     * 促销开始时间
     * @return promotion_start_time 促销开始时间
     */
    public Date getPromotionStartTime() {
        return promotionStartTime;
    }

    /**
     * 促销开始时间
     * @param promotionStartTime 促销开始时间
     */
    public void setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    /**
     * 促销结束时间
     * @return promotion_end_time 促销结束时间
     */
    public Date getPromotionEndTime() {
        return promotionEndTime;
    }

    /**
     * 促销结束时间
     * @param promotionEndTime 促销结束时间
     */
    public void setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    /**
     * 活动限购数量
     * @return promotion_per_limit 活动限购数量
     */
    public Integer getPromotionPerLimit() {
        return promotionPerLimit;
    }

    /**
     * 活动限购数量
     * @param promotionPerLimit 活动限购数量
     */
    public void setPromotionPerLimit(Integer promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
    }

    /**
     * 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     * @return promotion_type 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     */
    public Integer getPromotionType() {
        return promotionType;
    }

    /**
     * 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     * @param promotionType 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     */
    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    /**
     * 品牌名称
     * @return brand_name 品牌名称
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 品牌名称
     * @param brandName 品牌名称
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    /**
     * 商品分类名称
     * @return product_category_name 商品分类名称
     */
    public String getProductCategoryName() {
        return productCategoryName;
    }

    /**
     * 商品分类名称
     * @param productCategoryName 商品分类名称
     */
    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName == null ? null : productCategoryName.trim();
    }
}