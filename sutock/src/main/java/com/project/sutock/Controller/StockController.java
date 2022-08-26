package com.project.sutock.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.project.sutock.Dto.stockDto;
import com.project.sutock.Entity.stockEntity;
import com.project.sutock.Repository.stockRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/stock")
@RequiredArgsConstructor
public class StockController {
  
  private final stockRepository stockRepo;
  
  @GetMapping("") 
  public List<stockEntity> getStockList(@RequestParam String date){
    return stockRepo.findByTradeDateOrderByMarketCapDesc(date);
  }

  @GetMapping("/{ticker}")
  public List<stockEntity> getStockDetail(@PathVariable("ticker") String ticker){
    return stockRepo.findByTickerOrderByTradeDateDesc(ticker);
  }

  @PostMapping("")
  public stockEntity insertData(@RequestParam String jsonObject){
    System.out.println(jsonObject);
    stockDto dto=new Gson().fromJson( jsonObject,stockDto.class);
    return stockRepo.save(dto.toEntitiy());
  }
  
}
