package com.springbootforh5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(maxAge = 3600)
@RequestMapping(value = "/user")
public class UserController {

    @ResponseBody
    @RequestMapping("/test.do")
    public String test() {
        System.out.println("123456");
        return "123";
    }
}
