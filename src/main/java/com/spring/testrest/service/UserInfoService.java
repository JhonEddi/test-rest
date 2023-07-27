package com.spring.testrest.service;

import com.spring.testrest.domain.UserInfo;

import java.util.Optional;

public interface UserInfoService {
    Optional<UserInfo> getUserInfo();

    Optional<UserInfo> getUserInfoByPost(UserInfo userInfo);
}
