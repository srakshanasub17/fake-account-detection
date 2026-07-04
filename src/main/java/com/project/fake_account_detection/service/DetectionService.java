package com.project.fake_account_detection.service;


import com.project.fake_account_detection.model.DetectionRequest;
import com.project.fake_account_detection.model.DetectionResponse;
import com.project.fake_account_detection.entity.DetectionResult;
import com.project.fake_account_detection.repository.DetectionResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetectionService {

    @Autowired
    private DetectionResultRepository repository;

    public DetectionResponse analyze(DetectionRequest request) {

        double score = 0;

        if (request.getFollowers() < 100)
            score += 25;

        if (request.getFollowing() > 1000)
            score += 25;

        if (request.getPosts() < 10)
            score += 20;

        if (request.getAccountAge() < 30)
            score += 20;

        if ("No".equalsIgnoreCase(request.getProfilePicture()))
            score += 5;

        if ("No".equalsIgnoreCase(request.getBio()))
            score += 5;

        String result = (score >= 50) ? "Fake" : "Genuine";

        DetectionResult detection = repository
                .findByUsername(request.getUsername())
                .orElse(new DetectionResult());

        detection.setUsername(request.getUsername());
        detection.setFollowers(request.getFollowers());
        detection.setFollowing(request.getFollowing());
        detection.setPosts(request.getPosts());
        detection.setAccountAge(request.getAccountAge());
        detection.setFakeScore(score);
        detection.setResult(result);

        repository.save(detection);

        return new DetectionResponse(result, score);
    }
}