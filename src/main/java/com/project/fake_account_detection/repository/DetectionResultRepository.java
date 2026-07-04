package com.project.fake_account_detection.repository;

import com.project.fake_account_detection.entity.DetectionResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DetectionResultRepository extends JpaRepository<DetectionResult, Integer> {

    long countByResult(String result);

    Optional<DetectionResult> findByUsername(String username);

}