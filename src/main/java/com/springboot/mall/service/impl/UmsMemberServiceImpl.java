package com.springboot.mall.service.impl;

import com.springboot.mall.dto.CommonResult;
import com.springboot.mall.service.RedisService;
import com.springboot.mall.service.UmsMemberService;
import io.netty.util.internal.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Random;

/**
 * 会员管理Service实现类
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

  @Autowired
  private RedisService redisService;
  @Value("${redis.key.prefix.authCode}")
  private String REDIS_KEY_PREFIX_AUTH_CODE;
  @Value("${redis.key.expire.authCode}")
  private Long AUTH_CODE_EXPIRE_SECONDS;

  @Override
  public CommonResult generateAuthCode(String telephone){
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < 6; i++) {
      sb.append(random.nextInt(10));
    }
    redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + telephone, sb.toString());
    redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE = telephone , AUTH_CODE_EXPIRE_SECONDS);
    return new CommonResult().success("获取验证码成功",sb.toString());
  }


  @Override
  public CommonResult verifyAuthCode(String telephone, String authCode) {
    if(StringUtils.isEmpty(authCode)){
      return new CommonResult().failed("请输入验证码");
    }
    String realAuthCode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + telephone);
    boolean result = authCode.equals(realAuthCode);
    if (result) {
      return new CommonResult().success(null,"验证码校验成功");
    } else {
      return new CommonResult().failed("验证码不正确");
    }
  }
}
