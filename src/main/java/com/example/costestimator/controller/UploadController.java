package com.example.costestimator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.example.costestimator.data.Upload;
import com.example.costestimator.repository.UploadRepository;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@RestController // defines class as HTTP request and retuns method output as json
public class UploadController {

  private final UploadRepository uploadRepository;

  public UploadController(UploadRepository uploadRepository) {
    this.uploadRepository = uploadRepository;
  }

  @GetMapping("/uploads") // when get request at materials return this
  public List<Upload> listUploads() {
    return uploadRepository.findAll();

  }

  @PostMapping("/uploads")
  @ResponseStatus(HttpStatus.CREATED)
  public Upload addUpload(@RequestBody Upload upload) { // return type material from JSON made from Upload
                                                        // object

    upload.setEstimatedPrice(new BigDecimal("10.00")); // tmp
    upload.setCreatedAt(Instant.now());
    return uploadRepository.save(upload);
  }
}
