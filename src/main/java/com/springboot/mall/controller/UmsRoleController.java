package com.springboot.mall.controller;

import com.springboot.mall.dto.CommonResult;
import com.springboot.mall.model.UmsRole;
import com.springboot.mall.service.UmsRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
