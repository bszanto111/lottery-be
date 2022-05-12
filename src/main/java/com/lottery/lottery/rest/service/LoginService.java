package com.lottery.lottery.rest.service;

import com.lottery.lottery.entity.UserEntity;
import com.lottery.lottery.repository.UserRepository;
import com.lottery.lottery.rest.dto.LoginData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public boolean login(LoginData loginData) {
        UserEntity foundUserEntity = userRepository.findByIdAndPassword(loginData.getUserId(), loginData.getPassword());
        return foundUserEntity != null;
    }
}
