package com.springboot.mall.controller;

import com.springboot.mall.dto.CommonResult;
import com.springboot.mall.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 会员登录注册管理Controller
 */
@RestController
@Api(tags = "UmsMemberController", description = "会员登录注册管理")
@RequestMapping("/sso")
public class UmsMemberController {
  @Autowired
  private UmsMemberService umsMemberService;
  @ApiOperation("获取验证码")
  @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
  public CommonResult getAuthCode(@RequestParam("telephone") String telephone) {
    return umsMemberService.generateAuthCode(telephone);
  }
  @ApiOperation("判断验证码是否正确")
  @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
  public CommonResult updatePassword(@RequestParam String telephone,
                                     @RequestParam String authCode) {
    return umsMemberService.verifyAuthCode(telephone, authCode);
  }
}
