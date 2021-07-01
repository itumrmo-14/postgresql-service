package com.tut.postgresqlservice.service;

import com.tut.postgresqlservice.model.User;
import com.tut.postgresqlservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) throws Exception {
        if(Objects.isNull(user))
            throw new Exception("User cannot be null");

        userRepository.save(user);
    }

}
