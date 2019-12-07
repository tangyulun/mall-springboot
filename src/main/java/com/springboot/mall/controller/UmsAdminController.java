package com.springboot.mall.controller;

import com.springboot.mall.dto.CommonResult;
import com.springboot.mall.dto.UmsAdminLoginParam;
import com.springboot.mall.dto.UmsAdminParam;
import com.springboot.mall.model.UmsAdmin;
import com.springboot.mall.service.UmsAdminService;
import com.springboot.mall.utils.MD5Util;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 后台用户管理
 */
@Controller
@Api(tags = "UmsAdminController", description = "后台用户管理")
public class UmsAdminController {

  @Autowired
  private UmsAdminService adminService;

  @ApiOperation(value = "查询所有用户")
  @RequestMapping(value = "/getUsername", method = RequestMethod.POST)
  @ResponseBody
  public Object getAdminUsername(@RequestBody String username){
    return new CommonResult().success(adminService.getAdminUsername(username));
  }

  @ApiOperation(value = "用户登录")
  @RequestMapping(value = "/login", method = RequestMethod.POST)
  @ResponseBody
  public Object login(@RequestBody UmsAdminLoginParam umsAdminLoginParam, BindingResult result) {
    String username = umsAdminLoginParam.getUsername();
    String password = MD5Util.string2MD5(umsAdminLoginParam.getPassword());
    UmsAdmin adminInteger = adminService.login(username,password);
    if (adminInteger == null ) {
      return new CommonResult().validateFailed("用户名或密码错误，请重新输入！");
    }
    return new CommonResult().success(adminInteger);
  }

  @ApiOperation(value = "用户注册")
  @RequestMapping(value = "/register", method = RequestMethod.POST)
  @ResponseBody
  public Object register(@RequestBody UmsAdminParam umsAdminParam, BindingResult result) {
    UmsAdmin umsAdmin = adminService.register(umsAdminParam);
    if (umsAdmin == null) {
      return new CommonResult().validateFailed("用户名已存在！");
    }
    return new CommonResult().success(umsAdmin);
  }

}
