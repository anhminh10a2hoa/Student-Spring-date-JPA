package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
          Student anhminh = new Student(
                  1L,
                  "anhminh",
                  "anhminh10a2hoa@gmail.com",
                  LocalDate.of(2000, Month.JUNE, 25)
          );

          Student chieutrang = new Student(
                  1L,
                  "chieutrang",
                  "chieutrang@gmail.com",
                  LocalDate.of(2000, Month.JUNE, 25)
          );
          List<Student> studentList = new ArrayList<Student>();
          studentList.add(anhminh);
          studentList.add(chieutrang);
          repository.saveAll(studentList);
        };
    }
}
