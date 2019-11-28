package com.springboot.mall.model;

import java.util.Date;

public class UmsIntegrationChangeHistory {
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
    private Date createTime;

    /**
     * 改变类型：0->增加；1->减少
     */
    private Integer changeType;

    /**
     * 积分改变数量
     */
    private Integer changeCount;

    /**
     * 操作人员
     */
    private String operateMan;

    /**
     * 操作备注
     */
    private String operateNote;

    /**
     * 积分来源：0->购物；1->管理员修改
     */
    private Integer sourceType;

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
     * 改变类型：0->增加；1->减少
     * @return change_type 改变类型：0->增加；1->减少
     */
    public Integer getChangeType() {
        return changeType;
    }

    /**
     * 改变类型：0->增加；1->减少
     * @param changeType 改变类型：0->增加；1->减少
     */
    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    /**
     * 积分改变数量
     * @return change_count 积分改变数量
     */
    public Integer getChangeCount() {
        return changeCount;
    }

    /**
     * 积分改变数量
     * @param changeCount 积分改变数量
     */
    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    /**
     * 操作人员
     * @return operate_man 操作人员
     */
    public String getOperateMan() {
        return operateMan;
    }

    /**
     * 操作人员
     * @param operateMan 操作人员
     */
    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan == null ? null : operateMan.trim();
    }

    /**
     * 操作备注
     * @return operate_note 操作备注
     */
    public String getOperateNote() {
        return operateNote;
    }

    /**
     * 操作备注
     * @param operateNote 操作备注
     */
    public void setOperateNote(String operateNote) {
        this.operateNote = operateNote == null ? null : operateNote.trim();
    }

    /**
     * 积分来源：0->购物；1->管理员修改
     * @return source_type 积分来源：0->购物；1->管理员修改
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * 积分来源：0->购物；1->管理员修改
     * @param sourceType 积分来源：0->购物；1->管理员修改
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }
}