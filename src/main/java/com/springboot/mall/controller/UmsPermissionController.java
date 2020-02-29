package com.springboot.mall.controller;

import com.springboot.mall.dto.CommonResult;
import com.springboot.mall.dto.UmsPermissionNode;
import com.springboot.mall.model.UmsPermission;
import com.springboot.mall.service.UmsPermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台用户权限管理
 */
@Controller
@Api(tags = "UmsPermissionController", description = "后台用户权限管理")
@RequestMapping("/permission")
public class UmsPermissionController {
  @Autowired
  private UmsPermissionService umsPermissionService;
  @ApiOperation("获取所有权限列表")
  @RequestMapping(value = "/list", method = RequestMethod.GET)
  @ResponseBody
  public Object list() {
    List<UmsPermission> permissionList = umsPermissionService.list();
    return new CommonResult().success(permissionList);
  }
  @ApiOperation("添加权限")
  @RequestMapping(value = "/create", method = RequestMethod.POST)
  @ResponseBody
  public Object create(@RequestBody UmsPermission permission) {
    int count = umsPermissionService.create(permission);
    if (count>0){
      return new CommonResult().success(count);
    }
    return new CommonResult().failed();
  }
  @ApiOperation("修改权限")
  @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
  @ResponseBody
  public Object update(@PathVariable Long id, @RequestBody UmsPermission permission) {
    int count = umsPermissionService.update(id,permission);
    if (count > 0){
      return new CommonResult().success(permission);
    }
    return new CommonResult().failed();
  }
  @ApiOperation("根据id批量删除权限")
  @RequestMapping(value = "/delete", method = RequestMethod.POST)
  @ResponseBody
  public Object delete(@RequestParam("ids") List<Long> ids) {
    int count = umsPermissionService.delete(ids);
    if(count >0){
      return new CommonResult().success(count);
    }
    return new CommonResult().failed();
  }
  @ApiOperation("以层级结构返回所有权限")
  @RequestMapping(value = "/treeList", method = RequestMethod.GET)
  @ResponseBody
  public Object treeList() {
    List<UmsPermissionNode> permissionNodeList = umsPermissionService.treeList();
    return new CommonResult().success(permissionNodeList);
  }
}
