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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
  @ApiOperation(value = "根据用户名获取后台管理员")
  @RequestMapping(value = "/selectAdminByUsername", method = RequestMethod.POST)
  public Object selectAdminByUsername(@RequestParam("username") String username){
    return new CommonResult().success(adminService.selectAdminByUsername(username));
  }

  @ApiOperation(value = "用户登录")
  @RequestMapping(value = "/login", method = RequestMethod.POST)
  @CrossOrigin
  public Object login(@RequestBody UmsAdminLoginParam umsAdminLoginParam, HttpServletResponse response, HttpServletRequest request) {
    String username = umsAdminLoginParam.getUsername();
    String password = MD5Util.string2MD5(umsAdminLoginParam.getPassword());
    UmsAdmin adminInteger = adminService.login(username,password);
    response.setContentType("\"text/html;charset=utf-8\"");
    response.setCharacterEncoding("utf-8");
    if (adminInteger == null ) {
      return new CommonResult().validateFailed("用户名或密码错误，请重新输入！");
    }
    request.getSession().setAttribute("user","username");
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
  @ApiOperation(value = "获取当前登录用户信息")
  @RequestMapping(value = "/info", method = RequestMethod.GET)
  public Object getAdminInfo(Principal principal) {
    String  username = principal.getName();
    List<UmsAdmin> umsAdmin = adminService.selectAdminByUsername(username);
    Map<String, Object> data = new HashMap<>();
    data.put("username", umsAdmin.get(0).getUsername());
    data.put("roles", new String[]{"TEST"});
    data.put("icon", umsAdmin.get(0).getIcon());
    return new CommonResult().success(data);
  }
  @ApiOperation(value = "登出功能")
  @RequestMapping(value = "/logout", method = RequestMethod.POST)
  public Object logout() {
    return new CommonResult().success(null);
  }


}
