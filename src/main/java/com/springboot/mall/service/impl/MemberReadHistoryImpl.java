package com.springboot.mall.service.impl;

import com.springboot.mall.nosql.MemberReadHistory;
import com.springboot.mall.nosql.repository.MemberReadHistoryRepository;
import com.springboot.mall.service.MemberReadHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 会员浏览记录管理Service实现类
 */
@Service
public class MemberReadHistoryImpl implements MemberReadHistoryService {
  @Autowired
  private MemberReadHistoryRepository memberReadHistoryRepository;

  @Override
  public int create(MemberReadHistory memberReadHistory) {
    memberReadHistory.setId(null);
    memberReadHistory.setCreateTime(new Date());
    memberReadHistoryRepository.save(memberReadHistory);
    return 1;
  }

  @Override
  public List<MemberReadHistory> list(Long memberId) {
    return memberReadHistoryRepository.findByMemberIdOrderByCreateTimeDesc(memberId);
  }
}
