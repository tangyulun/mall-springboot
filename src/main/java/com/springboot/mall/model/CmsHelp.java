package com.springboot.mall.model;

import java.util.Date;

public class CmsHelp {
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
    private String icon;

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private Integer showStatus;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Integer readCount;

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
     * @return icon 
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon 
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
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