package com.springboot.mall.model;

import java.util.Date;

public class PmsCommentReplay {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long commentId;

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
     * 评论人员类型；0->会员；1->管理员
     */
    private Integer type;

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
     * @return comment_id 
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * 
     * @param commentId 
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
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
     * 评论人员类型；0->会员；1->管理员
     * @return type 评论人员类型；0->会员；1->管理员
     */
    public Integer getType() {
        return type;
    }

    /**
     * 评论人员类型；0->会员；1->管理员
     * @param type 评论人员类型；0->会员；1->管理员
     */
    public void setType(Integer type) {
        this.type = type;
    }
}