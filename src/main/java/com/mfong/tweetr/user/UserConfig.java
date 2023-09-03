package com.mfong.tweetr.user;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args ->{
            User alex = new User(
                1L,
                "Alex",
                "Luong",
                "Always wears a beanie.",
                Date.valueOf(LocalDate.of(2023, 1, 1))
                );

            User alice = new User(
                "Alice",
                "Luong",
                "Luong wears a beanie.",
                Date.valueOf(LocalDate.of(2023, 1, 1))
                );
            repository.saveAll(
                List.of(alex, alice)
            );
        };
    }
}
