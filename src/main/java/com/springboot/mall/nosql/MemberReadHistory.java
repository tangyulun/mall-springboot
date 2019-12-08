package com.springboot.mall.nosql;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * 用户商品浏览历史记录
 */
@Document
@Setter
@Getter
public class MemberReadHistory {
  @Id
  private String id;
  @Indexed
  private Long memberId;
  private String memberNickname;
  private String memberIcon;
  @Indexed
  private Long productId;
  private String productName;
  private String productPic;
  private String productSubTitle;
  private String productPrice;
  private Date createTime;
}
