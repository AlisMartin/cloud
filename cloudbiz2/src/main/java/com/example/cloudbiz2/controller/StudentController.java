package com.example.cloudbiz2.controller;

import com.example.cloudbiz2.entity.Student;
import com.example.cloudbiz2.service.FeignService;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by lp on 2020/8/17.
 */
@RestController
@RequestMapping(value="/student")
public class StudentController {

    @Autowired
    //private RestTemplate restTemplate;
    private FeignService feignService;

    @Value("${user.biz1servicepath}")
    private String biz1path;

    @Autowired
    EurekaClient eurekaClient;

    @GetMapping("/info")
    public Object getStudentInfo(){
        Student stu = new Student();
        stu.setAge("16");
        stu.setName("李四");
        return  stu;
    }

    @GetMapping("/getinfobyprov")
    public Object getStuInfo(){
        String url=biz1path+"/student/info";
        System.out.println("url+++++++++++++++++++++++++"+url);
        //return restTemplate.getForObject(url,Student.class);
        return feignService.findInfo();
    }
}
