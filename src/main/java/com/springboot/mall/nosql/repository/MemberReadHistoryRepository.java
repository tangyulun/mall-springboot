package com.springboot.mall.nosql.repository;

import com.springboot.mall.nosql.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 会员商品浏览历史Repository
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory,String > {
  /**
   * 根据会员id按时间倒序获取浏览记录
   * @param memberId
   * @return
   */
  List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}
