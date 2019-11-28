package com.springboot.mall.model;

public class UmsAdminPermissionRelation {
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
    private Long permissionId;

    /**
     * 
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
     * @return permission_id 
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * 
     * @param permissionId 
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * 
     * @return type 
     */
    public Integer getType() {
        return type;
    }

    /**
     * 
     * @param type 
     */
    public void setType(Integer type) {
        this.type = type;
    }
}