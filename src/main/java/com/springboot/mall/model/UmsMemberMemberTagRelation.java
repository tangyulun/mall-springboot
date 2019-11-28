package com.springboot.mall.model;

public class UmsMemberMemberTagRelation {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long memberId;

    /**
     * 
     */
    private Long tagId;

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
     * @return tag_id 
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * 
     * @param tagId 
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}