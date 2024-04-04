package com.example.security.security.Repositories;

import com.example.security.security.Models.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User findUserByEmail(String email){
        User user = new User(email, "123456");
        user.setFirstName("FirstName");
        user.setLastName("LastName");

        return user;
    }
}
