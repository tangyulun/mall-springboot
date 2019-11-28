package com.springboot.mall.model;

import java.util.Date;

public class CmsSubjectComment {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long subjectId;

    /**
     * 
     */
    private String memberNickName;

    /**
     * 
     */
    private String memberIcon;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Integer showStatus;

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
     * @return subject_id 
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * 
     * @param subjectId 
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
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
     * @return member_icon 
     */
    public String getMemberIcon() {
        return memberIcon;
    }

    /**
     * 
     * @param memberIcon 
     */
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon == null ? null : memberIcon.trim();
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
}