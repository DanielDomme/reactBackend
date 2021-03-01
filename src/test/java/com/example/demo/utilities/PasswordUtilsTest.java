package com.example.demo.utilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilsTest {
    private final static String PASSWORD = "643&*@jdadnfakd";
    @Test
    void encodeDecodeTest() {
        PasswordUtils passwordUtils = new PasswordUtils();

        assertTrue(passwordUtils.matches(PASSWORD, passwordUtils.encode(PASSWORD)));
    }

    @Test
    void matchesTest() {
        PasswordUtils passwordUtils = new PasswordUtils();
        String passwordUnderTest = passwordUtils.encode(PASSWORD);
        assertFalse(PASSWORD.matches(passwordUnderTest));
        assertTrue(passwordUtils.matches(PASSWORD, passwordUnderTest));
    }
}