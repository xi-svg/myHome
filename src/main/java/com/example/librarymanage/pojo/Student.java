package com.example.librarymanage.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {
private int id;//学号也是账号
private String studentName;
private int password;
private String studentSex;
private String collage;
private String major;
private String grade;
}