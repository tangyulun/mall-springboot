package com.springboot.mall.controller;

import com.springboot.mall.dto.CommonResult;
import com.springboot.mall.model.UmsPermission;
import com.springboot.mall.model.UmsRole;
import com.springboot.mall.service.UmsRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台用户角色管理
 */
@Controller
@Api(tags = "UmsRoleController", description = "后台用户角色管理")
@RequestMapping("/role")
public class UmsRoleController {
  @Autowired
  private UmsRoleService umsRoleService;
  @ApiOperation("获取所有角色")
  @RequestMapping(value = "/list",method = RequestMethod.GET)
  @ResponseBody
  public Object list(){
    List<UmsRole> roleList = umsRoleService.list();
    return new CommonResult().success(roleList);
  }
  @ApiOperation("添加角色")
  @RequestMapping(value = "/create", method = RequestMethod.POST)
  @ResponseBody
  public Object create(@RequestBody UmsRole role) {
    int count = umsRoleService.create(role);
    if(count>0){
      return new CommonResult().success(count);
    }
    return new CommonResult().failed();
  }

  @ApiOperation("修改角色")
  @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
  @ResponseBody
  public Object update(@PathVariable Long id, @RequestBody UmsRole role) {
    int count = umsRoleService.update(id ,role);
    if (count > 0){
      return new CommonResult().success(count);
    }
    return new CommonResult().failed();
  }

  @ApiOperation("批量删除角色")
  @RequestMapping(value = "/delete", method = RequestMethod.POST)
  @ResponseBody
  public Object delete(@RequestParam("ids") List<Long> ids) {
    int count = umsRoleService.delete(ids);
    if (count > 0) {
      return new CommonResult().success(count);
    }
    return new CommonResult().failed();
  }

  @ApiOperation("获取相应角色权限")
  @RequestMapping(value = "/permission/{roleId}", method = RequestMethod.GET)
  @ResponseBody
  public Object getPermissionList(@PathVariable Long roleId) {
    List<UmsPermission> permissionList = umsRoleService.getPermissionList(roleId);
    return new CommonResult().success(permissionList);
  }

  @ApiOperation("修改角色权限")
  @RequestMapping(value = "/permission/update", method = RequestMethod.POST)
  @ResponseBody
  public Object updatePermission(@RequestParam Long roleId,
                                 @RequestParam("permissionIds") List<Long> permissionIds) {
    int count = umsRoleService.updatePermission(roleId,permissionIds);
    if(count>0){
      return new CommonResult().success(count);
    }
    return new CommonResult().failed();
  }
}
