package com.project.fake_account_detection.repository;

import com.project.fake_account_detection.entity.SocialAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SocialAccountRepository extends JpaRepository<SocialAccount, Integer> {
    List<SocialAccount> findByUserId(Integer userId);
}