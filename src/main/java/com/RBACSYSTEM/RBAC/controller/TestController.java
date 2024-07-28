package com.RBACSYSTEM.RBAC.controller;

import com.RBACSYSTEM.RBAC.entity.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String getTest(){
        Test test = new Test(1,"ismail");
        return test.toString();
    }
}
