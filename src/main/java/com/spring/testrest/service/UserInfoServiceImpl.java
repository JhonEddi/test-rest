package com.spring.testrest.service;

import com.spring.testrest.domain.Document;
import com.spring.testrest.domain.UserInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mockito.Mock;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserInfoServiceImpl implements UserInfoService{

    final static Logger logger = LogManager.getLogger(UserInfoServiceImpl.class);
    @Mock
    private UserInfo userInfo = new UserInfo("Jhon", "Eddi", "Malagon", "Gonzalez",
            Document.C, 23445322L, 123456L, "Calle siempre viva", "Zipaquira");
    @Override
    public Optional<UserInfo> getUserInfo() {
        logger.info("Return user created without conditions");
        return Optional.ofNullable(userInfo);
    }

    @Override
    public Optional<UserInfo> getUserInfoByPost(UserInfo userInfoByPost) {
        logger.info("Return user with a valid document number");
        return Optional.ofNullable(userInfo.getNumOfDocument().equals(userInfoByPost.getNumOfDocument()) ? userInfo : null);
    }
}
