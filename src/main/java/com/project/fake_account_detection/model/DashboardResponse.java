package com.project.fake_account_detection.model;

public class DashboardResponse {

    private long totalAccounts;
    private long suspiciousAccounts;
    private long genuineAccounts;

    public DashboardResponse() {
    }

    public DashboardResponse(long totalAccounts, long suspiciousAccounts, long genuineAccounts) {
        this.totalAccounts = totalAccounts;
        this.suspiciousAccounts = suspiciousAccounts;
        this.genuineAccounts = genuineAccounts;
    }

    public long getTotalAccounts() {
        return totalAccounts;
    }

    public void setTotalAccounts(long totalAccounts) {
        this.totalAccounts = totalAccounts;
    }

    public long getSuspiciousAccounts() {
        return suspiciousAccounts;
    }

    public void setSuspiciousAccounts(long suspiciousAccounts) {
        this.suspiciousAccounts = suspiciousAccounts;
    }

    public long getGenuineAccounts() {
        return genuineAccounts;
    }

    public void setGenuineAccounts(long genuineAccounts) {
        this.genuineAccounts = genuineAccounts;
    }
}