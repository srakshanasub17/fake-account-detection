package com.project.fake_account_detection.controller;


import com.project.fake_account_detection.model.DetectionRequest;
import com.project.fake_account_detection.model.DetectionResponse;
import com.project.fake_account_detection.service.DetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DetectionController {

    @Autowired
    private DetectionService detectionService;

    @PostMapping("/analyze")
    public DetectionResponse analyze(@RequestBody DetectionRequest request) {
        return detectionService.analyze(request);
    }
}