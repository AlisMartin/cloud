package com.example.cloudbiz1.controller;

import com.example.cloudbiz1.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * Created by lp on 2020/8/17.
 */
@RestController
@RequestMapping(value="/student")
public class StudentController {
    @GetMapping("/info")
    public Object getStudentInfo(){
   /*     try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //sdat
        Student stu = new Student();
        stu.setAge("12");
        stu.setName("张三");
        return  stu;
    }
}
