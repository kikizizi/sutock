package com.project.sutock.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "stockTable")
@AllArgsConstructor
@SequenceGenerator(
  name = "stock_seq_generator",
  sequenceName = "stock_seq",
  initialValue = 1, allocationSize = 1)
@NoArgsConstructor
public class stockEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "stock_seq_generator")
  private Integer num;

  private String ticker;

  private String tradeDate;

  private Integer open;

  private Integer close;

  private Integer high;

  private Integer low;

  private Integer volume;

  private Long tradeVolume;  

  private Long marketCap;
}
