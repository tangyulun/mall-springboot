package com.springboot.mall.service.impl;

import com.springboot.mall.dao.UmsPermissionMapper;
import com.springboot.mall.model.UmsPermission;
import com.springboot.mall.model.UmsPermissionExample;
import com.springboot.mall.service.UmsPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 后台用户权限管理Service实现类
 */
@Service
public class UmsPermissionServiceImpl implements UmsPermissionService {
    @Autowired
    private UmsPermissionMapper umsPermissionMapper;
//
//    @Override
//    public int create(UmsPermission permission) {
//        return 1;
//    }
//
//    @Override
//    public int update(Long id, UmsPermission permission) {
//        return 1;
//    }
//
//    @Override
//    public int delete(List<Long> ids) {
//        return 1;
//    }
//
//    @Override
//    public List<UmsPermissionNode> treeList() {
//
//        return null;
//    }

    @Override
    public List<UmsPermission> list() {
        return umsPermissionMapper.selectByExample(new UmsPermissionExample());
    }

//    /**
//     * 将权限转换为带有子级的权限对象
//     * 当找不到子级权限的时候map操作不会再递归调用covert
//     */
//    private UmsPermissionNode covert(UmsPermission permission, List<UmsPermission> permissionList){
//        return null;
//    }
}
