package com.project.sutock.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.sutock.Entity.stockEntity;

public interface stockRepository extends JpaRepository<stockEntity,Integer>{
  List<stockEntity> findByTicker(String ticker);
  List<stockEntity> findByTradeDate(String tradeDate);
}
