package com.example.costestimator.data;

import java.math.BigDecimal;

public class Material {

  private Long id;
  private String name;
  private BigDecimal costPerGram;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName() {
    this.name = name;
  }

  public BigDecimal getCostPerGram() {
    return costPerGram;
  }

  public void setCostPerGram() {
    this.costPerGram = costPerGram;
  }

}
