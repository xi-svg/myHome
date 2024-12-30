package com.example.librarymanage.service.impl;

import ch.qos.logback.core.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.librarymanage.mapper.StudentMapper;
import com.example.librarymanage.pojo.Student;
import com.example.librarymanage.service.StudentService;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public String studentLogin(Student student) {//学生登录
        Student stu=studentMapper.selectById(student.getId());

        if(stu==null)
        {
            return "用户不存在";
        }
        if(!StringUtils.isEmpty(student.getStudentName())&&stu.getPassword()==student.getPassword())
        {
            return null;//登录成功
        }
        return "密码错误";

    }
}
