package com.springboot.mall.service;


import com.springboot.mall.dto.UmsPermissionNode;
import com.springboot.mall.model.UmsPermission;

import java.util.List;

/**
 * 后台用户权限管理Service
 */
public interface UmsPermissionService {
    /**
     * 添加权限
     * @param permission
     * @return
     */
    int create(UmsPermission permission);
    /**
     * 修改权限
     * @param id
     * @param permission
     * @return
     */
    int update(Long id, UmsPermission permission);
    /**
     * 批量删除权限
     * @param ids
     * @return
     */
    int delete(List<Long> ids);
    /**
     * 以层级结构返回所有权限
     * @return
     */
    List<UmsPermissionNode> treeList();
    /**
     * 获取所有权限
     * @return
     */
    List<UmsPermission> list();
}
