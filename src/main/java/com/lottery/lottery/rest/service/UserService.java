package com.lottery.lottery.rest.service;

import com.lottery.lottery.entity.UserEntity;
import com.lottery.lottery.repository.UserRepository;
import com.lottery.lottery.rest.dto.LoginData;
import com.lottery.lottery.rest.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        List<UserEntity> userEntities = (List<UserEntity>) userRepository.findAll();
        List<User> users = new ArrayList<>();
        for (UserEntity userEntity : userEntities) {
            users.add(new User(userEntity.getId(), userEntity.getName()));
        }
        return users;
    }
}
