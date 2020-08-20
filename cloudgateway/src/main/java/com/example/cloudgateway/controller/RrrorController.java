package com.example.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lp on 2020/8/17.
 */
@RestController
public class RrrorController {

    @GetMapping("/fallback")
    public Object fallback(){
        System.out.println("熔断返回方法+++++++++++++++++++++++++");
        Map<String,Object> result = new HashMap<String, Object>();
        result.put("code",0);
        result.put("msg","服务器繁忙");
        result.put("state",false);
        return  result;
    }
}
