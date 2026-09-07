package com.example.costestimator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.example.costestimator.data.Upload;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@RestController // defines class as HTTP request and retuns method output as json
public class UploadController {

  private List<Upload> uploads = new ArrayList<>();
  private long nextId = 1;

  @GetMapping("/uploads") // when get request at materials return this
  public List<Upload> listUploads() {
    return uploads;
  }

  @PostMapping("/uploads")
  @ResponseStatus(HttpStatus.CREATED)
  public Upload addUpload(@RequestBody Upload upload) { // return type material from JSON made from Upload
                                                        // object
    upload.setId(nextId);
    nextId++;

    upload.setEstimatedPrice(new BigDecimal("10")); // tmp
    upload.setCreatedAt(Instant.now());
    uploads.add(upload);
    return upload;
  }
}
