package com.example.costestimator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.costestimator.data.Material;
import java.util.ArrayList;
import java.util.List;

@RestController // defines class as HTTP request and retuns method output as json
public class MaterialController {

  private List<Material> materials = new ArrayList<>();
  private long nextId = 1;

  @GetMapping("/materials") // when get request at materials return this
  public List<Material> listMaterials() {
    return materials;
  }

  @PostMapping("/materials")
  public Material addMaterial(@RequestBody Material material) { // return type material from JSON made from material
                                                                // object
    material.setId(nextId);
    nextId++;
    materials.add(material);
    return material;
  }
}
