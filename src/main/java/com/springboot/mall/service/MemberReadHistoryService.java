package com.springboot.mall.service;

import com.springboot.mall.nosql.MemberReadHistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 会员浏览记录管理Service
 */
public interface MemberReadHistoryService {
  /**
   * 生成浏览记录
   * @param memberReadHistory
   * @return
   */
  int create(MemberReadHistory memberReadHistory);

  /**
   * 获取用户浏览历史记录
   * @param memberId
   * @return
   */
  List<MemberReadHistory> list(@Param("memberId") Long memberId);
}
