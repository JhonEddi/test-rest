package com.spring.testrest.service;

import com.spring.testrest.domain.Document;
import com.spring.testrest.domain.UserInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserInfoServiceImplTest {

    @Mock
    private UserInfo userInfo;

    @BeforeEach
    void setUp() {
        userInfo = new UserInfo("Jhon", "Eddi", "Malagon", "Gonzalez",
                Document.C, 2344532L, 123456L, "Calle siempre viva", "Zipaquira");
    }

    @Test
    void getValidUserDocumentNumber() {
        assertEquals(23445322L, userInfo.getNumOfDocument());
    }
}