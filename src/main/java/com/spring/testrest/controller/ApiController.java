package com.spring.testrest.controller;

import com.spring.testrest.domain.UserInfo;
import com.spring.testrest.service.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service")
public class ApiController {
    @Autowired
    private UserInfoServiceImpl userInfoServiceImpl;

    @GetMapping
    public ResponseEntity<UserInfo> returnUser() {
        return ResponseEntity.of(userInfoServiceImpl.getUserInfo());
    }

    @PostMapping("/User")
    public ResponseEntity<UserInfo> returnUserByPost(@RequestBody UserInfo userInfo) {
        return ResponseEntity.of(userInfoServiceImpl.getUserInfoByPost(userInfo));
    }
}
