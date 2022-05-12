package com.lottery.lottery.rest.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashSet;
import java.util.Set;

@Service
public class RandomNumberGeneratorService {

    private static final int maxLength = 49;

    public Set<Integer> getGeneratedRandomNumbers(int length) {
        if (length > maxLength) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
                    "Too many random numbers were requested. Maximum is " + maxLength + ".");
        }
        Set<Integer> randomNumbers = new HashSet<>();
        while (randomNumbers.size() < length) {
            int randomNumber = (int)(Math.random() * maxLength + 1);
            randomNumbers.add(randomNumber);
        }
        return randomNumbers;
    }
}
