package com.springboot.mall.model;

public class UmsAdminRoleRelation {
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
    private Long roleId;

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
     * @return role_id 
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 
     * @param roleId 
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}