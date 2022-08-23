package com.project.sutock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.sutock.Entity.testEntity;

public interface testRepository extends JpaRepository<testEntity,Long>{
    
}
