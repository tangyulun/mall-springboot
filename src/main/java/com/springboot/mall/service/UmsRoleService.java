package com.springboot.mall.service;


import com.springboot.mall.model.UmsPermission;
import com.springboot.mall.model.UmsRole;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 后台角色管理Service
 */
public interface UmsRoleService {
    /**
     * 添加角色
     * @param role
     * @return
     */
    int create(UmsRole role);

    /**
     * 修改角色信息
     * @param id
     * @param role
     * @return
     */
    int update(Long id, UmsRole role);
    /**
     * 批量删除角色
     * @param ids
     * @return
     */
    int delete(List<Long> ids);
    /**
     * 获取指定角色权限
     * @param roleId
     * @return
     */
    List<UmsPermission> getPermissionList(Long roleId);
    /**
     * 修改指定角色的权限
     * @param roleId
     * @param permissionIds
     * @return
     */
    @Transactional
    int updatePermission(Long roleId, List<Long> permissionIds);

    /**
     * 获取角色列表
     * @return
     */
    List<UmsRole> list();
}
