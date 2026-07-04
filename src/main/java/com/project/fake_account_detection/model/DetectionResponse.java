package com.project.fake_account_detection.model;

public class DetectionResponse {

    private String result;
    private double fakeScore;

    public DetectionResponse() {
    }

    public DetectionResponse(String result, double fakeScore) {
        this.result = result;
        this.fakeScore = fakeScore;
    }

    public String getResult() {
        return result;
    }

    public double getFakeScore() {
        return fakeScore;
    }
}
