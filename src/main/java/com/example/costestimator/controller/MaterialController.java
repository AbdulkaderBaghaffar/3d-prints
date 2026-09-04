package com.example.costestimator.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //defines class as HTTP request and retuns method output as json
public class MaterialController {
@GetMapping("/materials") //when get request at materials return this
public List<String> listMaterials(){
  return List.of("PLA","PETG","ABS","TPU");
  }
}
