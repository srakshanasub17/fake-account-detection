package com.project.fake_account_detection.controller;

import com.project.fake_account_detection.entity.User;
import com.project.fake_account_detection.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {

        User user = userRepository.findByUsername(username);

        if(user != null && user.getPassword().equals(password)) {
            return "redirect:/dashboard.html";
        } else {
            return "redirect:/login.html";
        }
    }
}
