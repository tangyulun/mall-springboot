package com.springboot.mall.model;

import java.util.Date;

public class UmsAdminLoginLog {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long adminId;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String ip;

    /**
     * 
     */
    private String address;

    /**
     * 浏览器登录类型
     */
    private String userAgent;

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
     * @return admin_id 
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * 
     * @param adminId 
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
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
     * @return ip 
     */
    public String getIp() {
        return ip;
    }

    /**
     * 
     * @param ip 
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 
     * @return address 
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 浏览器登录类型
     * @return user_agent 浏览器登录类型
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * 浏览器登录类型
     * @param userAgent 浏览器登录类型
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }
}