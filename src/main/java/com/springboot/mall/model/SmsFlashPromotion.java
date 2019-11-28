package com.springboot.mall.model;

import java.util.Date;

public class SmsFlashPromotion {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String title;

    /**
     * 开始日期
     */
    private Date startDate;

    /**
     * 结束日期
     */
    private Date endDate;

    /**
     * 上下线状态
     */
    private Integer status;

    /**
     * 秒杀时间段名称
     */
    private Date createTime;

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
     * 开始日期
     * @return start_date 开始日期
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 开始日期
     * @param startDate 开始日期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 结束日期
     * @return end_date 结束日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 结束日期
     * @param endDate 结束日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 上下线状态
     * @return status 上下线状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 上下线状态
     * @param status 上下线状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 秒杀时间段名称
     * @return create_time 秒杀时间段名称
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 秒杀时间段名称
     * @param createTime 秒杀时间段名称
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}