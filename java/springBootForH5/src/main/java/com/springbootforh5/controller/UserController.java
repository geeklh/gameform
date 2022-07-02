package com.springbootforh5.controller;

import com.springbootforh5.model.MyResult;
import com.springbootforh5.model.User;
import com.springbootforh5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(maxAge = 3600)
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/test.do")
    public String test() {
        System.out.println("123456");
        return "123";
    }

    @RequestMapping(value = "/addUserInfo.do",method = RequestMethod.POST)
    @ResponseBody
    public MyResult addUserInfoCon(@RequestBody User user){return userService.addUserInfo(user);}

    @RequestMapping(value = "/deleteUserInfo.dp",method = RequestMethod.DELETE)
    @ResponseBody
    public MyResult deleteUserInfoCon(@RequestBody User user){return  userService.deleteUserInfo(user);}

    @RequestMapping(value = "/updateUserPassAndreward.dp",method = RequestMethod.POST)
    @ResponseBody
    public  MyResult updateUserPassAndrewardCon(@RequestBody User user){return userService.updateUserPassAndreward(user);}

    @RequestMapping(value = "/updateUserPass.dp",method = RequestMethod.POST)
    @ResponseBody
    public MyResult updateUserPassCon(User user){return userService.updateUserPass(user);}

    @RequestMapping(value = "/updateReward.dp",method = RequestMethod.POST)
    @ResponseBody
    public MyResult updateRewardCon(User user){return userService.updateReward(user);}

    @RequestMapping(value = "/findUserinfo.dp",method = RequestMethod.POST)
    @ResponseBody
    public MyResult findUserinfoCon(User user){return userService.findUserinfo(user);}

    @RequestMapping(value = "/findUserName.dp",method = RequestMethod.POST)
    @ResponseBody
    public MyResult findUserNameCon(int id){return userService.findUserName(id);}

    @RequestMapping(value = "/findUserPassAndreward.dp",method = RequestMethod.POST)
    @ResponseBody
    public MyResult findUserPassAndrewardCon(int id){return userService.findUserPassAndreward(id);}

    @RequestMapping(value = "/findUserPass.dp",method = RequestMethod.POST)
    @ResponseBody
    public MyResult findUserPassCon(int id){return userService.findUserPass(id);}

    @RequestMapping(value = "/findUserReward.dp",method = RequestMethod.POST)
    @ResponseBody
    public MyResult findUserRewardCon(int id){return userService.findUserReward(id);}

}
