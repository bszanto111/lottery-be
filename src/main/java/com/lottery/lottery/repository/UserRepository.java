package com.lottery.lottery.repository;

import com.lottery.lottery.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    UserEntity findByIdAndPassword(String id, String password);
}