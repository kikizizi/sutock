package com.project.sutock.Entity;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "TESTTABLE")
public class testEntity {
  
  @Id
  private Long num;

  @Column(name = "text")
  private String text;

  @Temporal(TemporalType.TIMESTAMP)
  private Date createdDate;

  @Temporal(TemporalType.TIMESTAMP)
  private Date modifiedDate;

  // 이진데이터 저장가능
  // @Lob
  // private byte[] lobByte;

  // 임시보관용 객체
  // @Transient
  // private int temp;


}
