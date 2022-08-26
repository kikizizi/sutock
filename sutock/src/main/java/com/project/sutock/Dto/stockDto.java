package com.project.sutock.Dto;

import com.project.sutock.Entity.stockEntity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class stockDto {
  
  private String ticker;

  private String tradeDate;

  private Integer open;

  private Integer close;

  private Integer high;

  private Integer low;

  private Integer volume;

  private Long tradeVolume;  

  private Long marketCap;

  private String corporateName;

  public stockEntity toEntitiy(){
    stockEntity entity = new stockEntity();
    entity.setClose(close);
    entity.setHigh(high);
    entity.setLow(low);
    entity.setMarketCap(marketCap);
    entity.setOpen(open);
    entity.setTicker(ticker);
    entity.setTradeDate(tradeDate);
    entity.setTradeVolume(tradeVolume);
    entity.setVolume(volume);
    entity.setCorporateName(corporateName);
    return entity;  
  }
}
