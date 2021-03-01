package com.example.demo.services;

import com.example.demo.mockDB.UsersTable;
import com.example.demo.models.users.User;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JwtUserService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UsersTable usersTable = new UsersTable();
        Optional<User> userLookup = usersTable.select(userName);
        if(userLookup.isPresent() && userLookup.get().getUserName().equals(userName)) {
            User user = userLookup.get();
//            Collection<? extends GrantedAuthority> grantedAuthority = Collections.singleton((GrantedAuthority) user::getRole);
            List<SimpleGrantedAuthority> authorityList = new ArrayList<>();
            authorityList.add(new SimpleGrantedAuthority(user.getRole()));
            return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), authorityList); //userLookup.get();
        } else {
            throw new UsernameNotFoundException("User was not found with username: " + userName);
        }
    }

}
