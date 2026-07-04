package com.project.fake_account_detection.controller;

import com.project.fake_account_detection.model.DashboardResponse;
import com.project.fake_account_detection.repository.DetectionResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

    @Autowired
    private DetectionResultRepository repository;

    @GetMapping("/dashboard-data")
    public DashboardResponse getDashboardData() {

        long total = repository.count();

        long fake = repository.countByResult("Fake");

        long genuine = repository.countByResult("Genuine");

        return new DashboardResponse(total, fake, genuine);
    }
}
