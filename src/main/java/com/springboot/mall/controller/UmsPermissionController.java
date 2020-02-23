package com.springboot.mall.controller;

import com.springboot.mall.dto.CommonResult;
import com.springboot.mall.model.UmsPermission;
import com.springboot.mall.service.UmsPermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
