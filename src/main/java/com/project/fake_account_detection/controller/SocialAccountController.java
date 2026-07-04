package com.project.fake_account_detection.controller;

import com.project.fake_account_detection.entity.SocialAccount;
import com.project.fake_account_detection.repository.SocialAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SocialAccountController {

    @Autowired
    private SocialAccountRepository socialAccountRepository;

    @PostMapping("/social-account")
    public String saveSocialAccount(
            @RequestParam Integer userId,
            @RequestParam Integer followers,
            @RequestParam Integer following,
            @RequestParam Integer posts,
            @RequestParam Integer accountAge) {

        SocialAccount account = new SocialAccount();

        account.setUserId(userId);
        account.setFollowers(followers);
        account.setFollowing(following);
        account.setPosts(posts);
        account.setAccountAge(accountAge);

        socialAccountRepository.save(account);

        return "redirect:/dashboard.html";
    }
}