package com.springboot.mall.controller;

import com.springboot.mall.dto.CommonResult;
import com.springboot.mall.dto.UmsAdminParam;
import com.springboot.mall.model.UmsAdmin;
import com.springboot.mall.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
  @Value("${jwt.tokenHeader}")
  private String tokenHeader;
  @Value("${jwt.tokenHead}")
  private String tokenHead;
  @ApiOperation(value = "用户注册")
  @RequestMapping(value = "/register", method = RequestMethod.POST)
  @ResponseBody
  public Object register(@RequestBody UmsAdminParam umsAdminParam, BindingResult result){
    UmsAdmin umsAdmin = adminService.register(umsAdminParam);
    if(umsAdmin == null) {
      new CommonResult().failed();
    }
    return new CommonResult().success(umsAdmin);
  }
//
//  @ApiOperation(value = "登录以后返回token")
//  @RequestMapping(value = "/login", method = RequestMethod.POST)
//  @ResponseBody
//    public Object login(@RequestBody UmsAdminLoginParam umsAdminLoginParam,BindingResult result ){
//      String token  = adminService.login(umsAdminLoginParam.getUsername(),umsAdminLoginParam.getPassword());
//      if (token == null) {
//        return new CommonResult().validateFailed("用户名密码错误！");
//      }
//      Map<String,String> tokenMap = new HashMap<>();
//      tokenMap.put("token",token);
//      tokenMap.put("tokenHead",tokenHead);
//      return new CommonResult().success(tokenMap);
//
//
//    }
//
//  @ApiOperation("获取用户所有权限（包括+-权限）")
//  @RequestMapping(value = "/permission/{adminId}", method = RequestMethod.GET)
//  @ResponseBody
//  public Object getPermissionList(@PathVariable Long adminId){
//    List<UmsPermission> permissionList = adminService.getPermissionList(adminId);
//    return new CommonResult().success(permissionList);
//  }
}
