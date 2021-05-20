package io.github.arsonidtcook.microstudentapi.model;

import io.github.arsonidtcook.microstudentapi.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            repository.saveAll(
                    List.of(
                            new Student(
                                    1L,
                                    "Mariam",
                                    "mariam.jamal@gmail.com",
                                    LocalDate.of(2000, Month.JANUARY, 5)
                            ),
                            new Student(
                                    "Alex",
                                    "alex@gmail.com",
                                    LocalDate.of(2004, Month.JANUARY, 5)
                            )
                    )
            );
        };
    }
}
