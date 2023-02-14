package com.jin.taskmanager.config;

import com.jin.taskmanager.model.Group;
import com.jin.taskmanager.model.User;
import com.jin.taskmanager.model.Task;
import com.jin.taskmanager.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Timestamp;
import java.util.Date;

@Configuration
public class GeneralConfig {

    @Bean
    CommandLineRunner commandLineRunner (TaskRepository taskRepository){

        Date now = new Date();
        Timestamp timestamp = new Timestamp(now.getTime());
        double percentage = 50;

        return args -> {

            Group c1 = new Group(
                "SIP025",
                "Esto es una prueba",
                timestamp,
                timestamp
            );

            User p1 = new User(
                    "Juan",
                    "juan@mail.com"
            );

            Task t1 = new Task(
                    p1,
                    c1,
                    "code",
                    "title",
                    timestamp,
                    timestamp,
                    timestamp,
                    timestamp,
                    10L,
                    80L,
                    percentage,
                    percentage,
                    "IMPLEMENTADO",
                    "UAT",
                    Boolean.TRUE
            );

            taskRepository.save(t1);

        };
    };
}
