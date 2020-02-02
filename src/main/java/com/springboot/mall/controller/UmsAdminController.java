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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * 后台用户管理
 */
@RestController
@Api(tags = "UmsAdminController", description = "后台用户管理")
@RequestMapping("/admin")
public class UmsAdminController {

  @Autowired
  private UmsAdminService adminService;

  @ApiOperation(value = "查询所有用户")
  @RequestMapping(value = "/getUsername", method = RequestMethod.POST)
  public Object getAdminUsername(@RequestParam("username") String username){
    return new CommonResult().success(adminService.getAdminUsername(username));
  }

  @ApiOperation(value = "用户登录")
  @RequestMapping(value = "/login", method = RequestMethod.POST)
  @CrossOrigin
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
  public Object register(@RequestBody UmsAdminParam umsAdminParam, BindingResult result) {
    UmsAdmin umsAdmin = adminService.register(umsAdminParam);
    if (umsAdmin == null) {
      return new CommonResult().validateFailed("用户名已存在！");
    }
    return new CommonResult().success(umsAdmin);
  }

}
