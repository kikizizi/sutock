package com.project.sutock.Controller;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {
  // @Autowired
   
 
  @GetMapping("") 
  public String getAllList(){
    return "all_data";
  }

  @GetMapping("/{code}")
  public String getOneData(@PathVariable("code") int code){
    return "get data("+code+")";
  }

  @PostMapping("")
  public String createData(@RequestParam(required = true) int code){
    return "data("+code+") created";
  }

  @PutMapping("/{code}")
  public String changePut(@PathVariable("code") int code){
    return "data("+code+") changed (put)";
  }

  @PatchMapping("/{code}")
  public String changePatch(@PathVariable("code") int code){
    return "data("+code+") changed (patch)";
  }

  @DeleteMapping("/{code}")
  public String delData(@PathVariable("code") int code){
    return "data("+code+") deleted";
  }
}
