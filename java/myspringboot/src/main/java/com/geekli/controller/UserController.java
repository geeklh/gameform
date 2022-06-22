package com.geekli.controller;


import com.geekli.model.MyResult;
import com.geekli.model.User;
import com.geekli.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//import com.geekli.model.Userbackform;
//import com.geekli.model.UserscKey;
//import com.geekli.service.UserService;
//import com.geekli.utils.TESTOKHttp;

import java.util.List;

@Controller
@CrossOrigin(maxAge = 3600)
@Api(value = "用户配置", tags = "用户接口")
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/login")
    public MyResult login(@RequestBody User user) {
        return userService.login(user);
    }


}
