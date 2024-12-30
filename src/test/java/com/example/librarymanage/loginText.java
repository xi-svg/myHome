package com.example.librarymanage;

import com.example.librarymanage.mapper.StudentMapper;
import com.example.librarymanage.pojo.Student;
import com.example.librarymanage.service.impl.StudentServiceImpl;
import jakarta.activation.DataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = LibraryManageApplicationTests.class)
public class loginText {
    @Autowired
    private Student st;


    @Test
    public void login() {
       if(st==null)
       {
           System.out.printf("true");
       }

    }
}
