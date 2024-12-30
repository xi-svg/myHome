package com.example.librarymanage;

import com.example.librarymanage.pojo.Student;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@MapperScan("com.example.librarymanage.mapper")
@SpringBootApplication
public class LibraryManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryManageApplication.class, args);
    }

    @Bean
    public Student student(){
        return new Student();
    }
}
