package com.lottery.lottery;

import com.lottery.lottery.entity.UserEntity;
import com.lottery.lottery.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LotteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LotteryApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			userRepository.save(new UserEntity("1234", "bszanto", "qwerty12"));
			userRepository.save(new UserEntity("2345", "tszabo", "1234"));
			userRepository.save(new UserEntity("3456", "ttoth", "g0oD_Pa55W0rd"));
		};
	}

}
