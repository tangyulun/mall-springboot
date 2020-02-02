package com.springboot.mall.controller;

import com.springboot.mall.dto.CommonResult;
import com.springboot.mall.nosql.MemberReadHistory;
import com.springboot.mall.service.MemberReadHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 会员商品浏览记录管理Controller
 */
@RestController
@Api(tags = "MemberReadHistoryController", description = "会员商品浏览记录管理")
@RequestMapping("/member/readHistory")
public class MemberReadHistoryController {
  @Autowired
  private MemberReadHistoryService memberReadHistoryService;

  @ApiOperation("创建浏览记录")
  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public Object create(@RequestBody MemberReadHistory memberReadHistory) {
    int count = memberReadHistoryService.create(memberReadHistory);
    if (count > 0) {
      return new CommonResult().success(count);
    }
    return new CommonResult().failed();
  }

  @ApiOperation("展示浏览记录")
  @RequestMapping(value = "/list", method = RequestMethod.GET)
  public Object list(@RequestParam("memberId") Long memberId){
    List<MemberReadHistory> list = memberReadHistoryService.list(memberId);
    return new CommonResult().success(list);
  }
}
