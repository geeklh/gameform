package com.springbootforh5.service.lmpl;

import com.springbootforh5.dao.UserBehavior;
import com.springbootforh5.dao.UserMapper;
import com.springbootforh5.model.MyResult;
import com.springbootforh5.model.User;
import com.springbootforh5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "userService")
public class UserServicelmpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserBehavior userBehavior;


    @Override
    public MyResult login(User user) {
        User u = new User();
        List<User> list = new ArrayList<>();
//        list = userMapper.login(user);
        MyResult result = new MyResult();
        if (list.size() != 0) {
            result.setCode(0);
            result.setMsg("成功");
//            result.setObj(list.get(0));
        }else {
            result.setCode(1);
            result.setMsg("失败");
        }
        return result;
    }

    //    添加
    @Override
    public  MyResult addUserInfo(User user){
        MyResult result = new MyResult();
        result.setCode(201);
        result.setObj(null);
        try {
            userBehavior.addUser(user);
            result.setMsg("添加成功");
            result.setCode(200);
            result.setObj(user);
        } catch (Exception e){
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    //    删除 根据id进行删除 没必要查询是否存在用户 减少查表频率
    @Override
    public MyResult deleteUserInfo(User user){
        MyResult result = new MyResult();
        result.setCode(200);
        result.setMsg("删除成功");
        userBehavior.deleteUser(user);
        result.setObj(user);
        return result;
    }

    //    修改
    @Override
    public MyResult updateUserPassAndreward(User user){
        MyResult result = new MyResult();
        userBehavior.updateUserPassAndreward(user);
        result.setCode(200);
        result.setMsg("更新成功");
        result.setObj(user);
        return result;
    }
    @Override
    public MyResult updateUserPass(User user){
        MyResult result = new MyResult();
        userBehavior.updateUserPass(user);
        result.setCode(200);
        result.setMsg("更新成功");
        result.setObj(user);
        return result;
    }
    @Override
    public MyResult updateReward(User user){
        MyResult result = new MyResult();
        userBehavior.updateReward(user);
        result.setCode(200);
        result.setMsg("更新成功");
        result.setObj(user);
        return result;
    }

    //    查询
    @Override
    public MyResult findUserinfo(User user){
        MyResult result = new MyResult();
        result.setObj(userBehavior.findUserinfo(user));
        result.setCode(200);
        result.setMsg("查询成功");
        return result;
    }
    @Override
    public MyResult findUserName(int id){
        MyResult result = new MyResult();
        result.setObj(userBehavior.findUserName(id));
        result.setMsg("查询成功");
        result.setCode(200);
        return result;
    }
    @Override
    public MyResult findUserPassAndreward(int id){
        MyResult result = new MyResult();
        result.setObj(userBehavior.findUserPassAndreward(id));
        result.setMsg("查询成功");
        result.setCode(200);
        return result;
    }
    @Override
    public MyResult findUserPass(int id){
        MyResult result = new MyResult();
        result.setObj(userBehavior.findUserPass(id));
        result.setMsg("查询成功");
        result.setCode(200);
        return result;
    }
    @Override
    public MyResult findUserReward(int id){
        MyResult result = new MyResult();
        result.setObj(userBehavior.findUserReward(id));
        result.setMsg("查询成功");
        result.setCode(200);
        return result;
    }

}
