package com.example.librarymanage.controller;

import com.example.librarymanage.pojo.Student;
import com.example.librarymanage.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private StudentServiceImpl stuService;

    @PostMapping("studentLogin")
    public void studentLogin(@RequestBody Student student)
    {

    }
}
