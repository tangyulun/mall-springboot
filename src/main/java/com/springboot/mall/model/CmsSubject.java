package com.springboot.mall.model;

import java.util.Date;

public class CmsSubject {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long categoryId;

    /**
     * 
     */
    private String title;

    /**
     * 专题主图
     */
    private String pic;

    /**
     * 关联产品数量
     */
    private Integer productCount;

    /**
     * 
     */
    private Integer recommendStatus;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Integer collectCount;

    /**
     * 
     */
    private Integer readCount;

    /**
     * 
     */
    private Integer commentCount;

    /**
     * 画册图片用逗号分割
     */
    private String albumPics;

    /**
     * 
     */
    private String description;

    /**
     * 显示状态：0->不显示；1->显示
     */
    private Integer showStatus;

    /**
     * 转发数
     */
    private Integer forwardCount;

    /**
     * 专题分类名称
     */
    private String categoryName;

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
     * @return category_id 
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 
     * @param categoryId 
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 
     * @return title 
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 专题主图
     * @return pic 专题主图
     */
    public String getPic() {
        return pic;
    }

    /**
     * 专题主图
     * @param pic 专题主图
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * 关联产品数量
     * @return product_count 关联产品数量
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * 关联产品数量
     * @param productCount 关联产品数量
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * 
     * @return recommend_status 
     */
    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    /**
     * 
     * @param recommendStatus 
     */
    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
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
     * @return collect_count 
     */
    public Integer getCollectCount() {
        return collectCount;
    }

    /**
     * 
     * @param collectCount 
     */
    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
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
     * 
     * @return comment_count 
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * 
     * @param commentCount 
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 画册图片用逗号分割
     * @return album_pics 画册图片用逗号分割
     */
    public String getAlbumPics() {
        return albumPics;
    }

    /**
     * 画册图片用逗号分割
     * @param albumPics 画册图片用逗号分割
     */
    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics == null ? null : albumPics.trim();
    }

    /**
     * 
     * @return description 
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 显示状态：0->不显示；1->显示
     * @return show_status 显示状态：0->不显示；1->显示
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 显示状态：0->不显示；1->显示
     * @param showStatus 显示状态：0->不显示；1->显示
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * 转发数
     * @return forward_count 转发数
     */
    public Integer getForwardCount() {
        return forwardCount;
    }

    /**
     * 转发数
     * @param forwardCount 转发数
     */
    public void setForwardCount(Integer forwardCount) {
        this.forwardCount = forwardCount;
    }

    /**
     * 专题分类名称
     * @return category_name 专题分类名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 专题分类名称
     * @param categoryName 专题分类名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
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