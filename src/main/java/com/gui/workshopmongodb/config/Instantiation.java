package com.gui.workshopmongodb.config;

import com.gui.workshopmongodb.domain.User;
import com.gui.workshopmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User maria = new User(null, "Cecília Bombada", "ceci@gmail.com");
        User pedro = new User(null, "Pedro Prestes", "pedro@gmail.com");
        User jhulia = new User(null, "Jhulia Jones", "julhinha@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, pedro, jhulia));
    }
}
