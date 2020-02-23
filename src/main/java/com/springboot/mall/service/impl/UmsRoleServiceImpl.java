package com.springboot.mall.service.impl;


import com.springboot.mall.dao.UmsRoleMapper;
import com.springboot.mall.model.UmsRole;
import com.springboot.mall.model.UmsRoleExample;
import com.springboot.mall.service.UmsRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 后台角色管理Service实现类
 */
@Service
public class UmsRoleServiceImpl implements UmsRoleService {
    @Autowired
    private UmsRoleMapper umsRoleMapper;
//    @Override
//    public int create(UmsRole role) {
//        return 1;
//    }
//
//    @Override
//    public int update(Long id, UmsRole role) {
//        return 1;
//    }
//
//    @Override
//    public int delete(List<Long> ids) {
//        return 1;
//    }
//
//    @Override
//    public List<UmsPermission> getPermissionList(Long roleId) {
//        return null;
//    }
//
//    @Override
//    public int updatePermission(Long roleId, List<Long> permissionIds) {
//        return 1;
//    }

    @Override
    public List<UmsRole> list() {
        return umsRoleMapper.selectByExample(new UmsRoleExample());
    }
}
