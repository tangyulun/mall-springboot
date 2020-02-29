package com.springboot.mall.service.impl;

import com.springboot.mall.dao.UmsPermissionMapper;
import com.springboot.mall.dto.UmsPermissionNode;
import com.springboot.mall.model.UmsPermission;
import com.springboot.mall.model.UmsPermissionExample;
import com.springboot.mall.service.UmsPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 后台用户权限管理Service实现类
 */
@Service
public class UmsPermissionServiceImpl implements UmsPermissionService {
    @Autowired
    private UmsPermissionMapper umsPermissionMapper;

    @Override
    public int create(UmsPermission permission) {
        permission.setStatus(1);
        permission.setCreateTime(new Date());
        permission.setSort(0);
        return umsPermissionMapper.insert(permission);
    }

    @Override
    public int update(Long id, UmsPermission permission) {
        permission.setId(id);
        return umsPermissionMapper.updateByPrimaryKey(permission);
    }

    @Override
    public int delete(List<Long> ids) {
        UmsPermissionExample example = new UmsPermissionExample();
        example.createCriteria().andIdIn(ids);
        return umsPermissionMapper.deleteByExample(example);
    }

    @Override
    public List<UmsPermissionNode> treeList() {
        List<UmsPermission> permissionList = umsPermissionMapper.selectByExample(new UmsPermissionExample());
        List<UmsPermissionNode> result = permissionList.stream()
            .filter(permission -> permission.getPid().equals(0L))
            .map(permission -> covert(permission,permissionList)).collect(Collectors.toList());
        return result;
    }

    @Override
    public List<UmsPermission> list() {
        return umsPermissionMapper.selectByExample(new UmsPermissionExample());
    }

    /**
     * 将权限转换为带有子级的权限对象
     * 当找不到子级权限的时候map操作不会再递归调用covert
     */
    private UmsPermissionNode covert(UmsPermission permission, List<UmsPermission> permissionList){
        return null;
    }
}
