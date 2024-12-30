package com.example.librarymanage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.librarymanage.pojo.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService extends IService<Student> {
    String studentLogin(Student student);
}
