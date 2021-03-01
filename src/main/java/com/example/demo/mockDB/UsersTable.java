package com.example.demo.mockDB;

import com.example.demo.models.users.User;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

@NoArgsConstructor
public class UsersTable {
    private static final ArrayList<User> USERS = new ArrayList<>(Arrays.asList(
            new User("daniel.domme", "$2a$10$9E3nTLUT2Kmv2Ee0Cr8ZP.dWcd7GR/ouQCH2N51Uj2X9Ht5euONn6", "admin"),
            new User("youngAsh", "$2a$10$CIcD..sRSnhWU8e6r.IpturfmtcniLGzIGmifd5Vx1yuZu0HrwqGC", "user")
    ));

//    public users_table() {
//        users = new ArrayList<>();
//        users.add(new User("daniel.domme", "", "admin"
//        ));
//    }

    public Optional<User> select(String userName) {
        return USERS.stream().filter(user -> user.getUserName().equals(userName)).findFirst();
    }
}
