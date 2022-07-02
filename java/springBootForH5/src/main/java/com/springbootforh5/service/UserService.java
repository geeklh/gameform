package com.springbootforh5.service;

import com.springbootforh5.model.MyResult;
import com.springbootforh5.model.User;

public interface UserService {
    MyResult login(User user);

    //    添加
    MyResult addUserInfo(User user);

    //    删除
    MyResult deleteUserInfo(User user);

    //    修改
    MyResult updateUserPassAndreward(User user);
    MyResult updateUserPass(User user);
    MyResult updateReward(User user);

    //    查询
    MyResult findUserinfo(User user);
    MyResult findUserName(int id);
    MyResult findUserPassAndreward(int id);
    MyResult findUserPass(int id);
    MyResult findUserReward(int id);

}
