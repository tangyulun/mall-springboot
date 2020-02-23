package com.springboot.mall.model;

import java.util.Date;

public class UmsPermission {
    /**
     * 
     */
    private Long id;

    /**
     * 父级权限id
     */
    private Long pid;

    /**
     * 名称
     */
    private String name;

    /**
     * 权限值
     */
    private String value;

    /**
     * 图标
     */
    private String icon;

    /**
     * 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     */
    private Integer type;

    /**
     * 前端资源路径
     */
    private String uri;

    /**
     * 启用状态；0->禁用；1->启用
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 排序
     */
    private Integer sort;

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
     * 父级权限id
     * @return pid 父级权限id
     */
    public Long getPid() {
        return pid;
    }

    /**
     * 父级权限id
     * @param pid 父级权限id
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * 名称
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 权限值
     * @return value 权限值
     */
    public String getValue() {
        return value;
    }

    /**
     * 权限值
     * @param value 权限值
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * 图标
     * @return icon 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 图标
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     * @return type 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     * @param type 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 前端资源路径
     * @return uri 前端资源路径
     */
    public String getUri() {
        return uri;
    }

    /**
     * 前端资源路径
     * @param uri 前端资源路径
     */
    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    /**
     * 启用状态；0->禁用；1->启用
     * @return status 启用状态；0->禁用；1->启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 启用状态；0->禁用；1->启用
     * @param status 启用状态；0->禁用；1->启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 排序
     * @return sort 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}