package com.springboot.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * UmsAdminUsername
 */
@Getter
@Setter
public class UmsAdminUsername {
  @ApiModelProperty(value = "用户名", required = true)
  private String username;
}
