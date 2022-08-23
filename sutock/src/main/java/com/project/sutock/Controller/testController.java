package com.project.sutock.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.sutock.Entity.testEntity;
import com.project.sutock.Repository.testRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor 
public class testController {
  private final testRepository testRepo;

  @PostMapping("/")
  public testEntity insert(@RequestParam Long id , @RequestParam String text){
    testEntity entity = new testEntity();
    entity.setId(id);
    entity.setText(text);
    entity.setCreatedDate(new Date());
    return testRepo.save(entity);
  }

  @GetMapping("/")
  public List<testEntity> getAll(){
    return testRepo.findAll();
  }

  @GetMapping("/{id}")
  public Optional<testEntity> getOne(@PathVariable Long id){
    return testRepo.findById(id);
  }

  @DeleteMapping
  public void delete(@RequestParam Long id){
    testRepo.deleteById(id);
  }

  @PutMapping("/{id}")
  public testEntity update(@PathVariable Long id,@RequestParam String text){
    Optional<testEntity> entity = testRepo.findById(id);
    entity.get().setText(text);
    entity.get().setModifiedDate(new Date());
    return testRepo.save(entity.get());
  }
}
