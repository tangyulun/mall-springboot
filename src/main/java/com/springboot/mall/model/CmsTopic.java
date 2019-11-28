package com.springboot.mall.model;

import java.util.Date;

public class CmsTopic {
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
    private String name;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date startTime;

    /**
     * 
     */
    private Date endTime;

    /**
     * 参与人数
     */
    private Integer attendCount;

    /**
     * 关注人数
     */
    private Integer attentionCount;

    /**
     * 
     */
    private Integer readCount;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 参与方式
     */
    private String attendType;

    /**
     * 话题内容
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
     * @return start_time 
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 
     * @param startTime 
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 
     * @return end_time 
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 
     * @param endTime 
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 参与人数
     * @return attend_count 参与人数
     */
    public Integer getAttendCount() {
        return attendCount;
    }

    /**
     * 参与人数
     * @param attendCount 参与人数
     */
    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    /**
     * 关注人数
     * @return attention_count 关注人数
     */
    public Integer getAttentionCount() {
        return attentionCount;
    }

    /**
     * 关注人数
     * @param attentionCount 关注人数
     */
    public void setAttentionCount(Integer attentionCount) {
        this.attentionCount = attentionCount;
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
     * 奖品名称
     * @return award_name 奖品名称
     */
    public String getAwardName() {
        return awardName;
    }

    /**
     * 奖品名称
     * @param awardName 奖品名称
     */
    public void setAwardName(String awardName) {
        this.awardName = awardName == null ? null : awardName.trim();
    }

    /**
     * 参与方式
     * @return attend_type 参与方式
     */
    public String getAttendType() {
        return attendType;
    }

    /**
     * 参与方式
     * @param attendType 参与方式
     */
    public void setAttendType(String attendType) {
        this.attendType = attendType == null ? null : attendType.trim();
    }

    /**
     * 话题内容
     * @return content 话题内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 话题内容
     * @param content 话题内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}