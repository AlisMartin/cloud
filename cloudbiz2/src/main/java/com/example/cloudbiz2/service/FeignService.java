package com.example.cloudbiz2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by lp on 2020/8/19.
 */
@FeignClient("client1")
public interface FeignService {
    @GetMapping("/student/info")
    Object findInfo();
}
