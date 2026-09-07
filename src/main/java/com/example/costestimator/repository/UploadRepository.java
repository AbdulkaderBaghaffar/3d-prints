package com.example.costestimator.repository;

import com.example.costestimator.data.Upload;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UploadRepository extends JpaRepository<Upload, Long> {
}
