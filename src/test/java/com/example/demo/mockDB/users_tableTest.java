package com.example.demo.mockDB;

import com.example.demo.domains.users.User;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class users_tableTest {
    private static final String EXPECTED_USER_NAME = "daniel.domme";
    @Test
    void testSelectUserValid() {
        UsersTable usersTable = new UsersTable();
        Optional<User> result = usersTable.select("daniel.domme");
        assertTrue(result.isPresent());
        assertEquals(EXPECTED_USER_NAME, result.get().getUserName());
    }

    @Test
    void testSelectUserFail() {
        UsersTable usersTable = new UsersTable();
        Optional<User> result = usersTable.select("random");
        assertTrue(result.isEmpty());
    }
}