package com.project.fake_account_detection.service;

import com.project.fake_account_detection.entity.SocialAccount;
import com.project.fake_account_detection.repository.SocialAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialAccountService {

    @Autowired
    private SocialAccountRepository socialAccountRepository;

    public SocialAccount saveSocialAccount(SocialAccount socialAccount) {
        return socialAccountRepository.save(socialAccount);
    }

    public List<SocialAccount> getAllSocialAccounts() {
        return socialAccountRepository.findAll();
    }
}