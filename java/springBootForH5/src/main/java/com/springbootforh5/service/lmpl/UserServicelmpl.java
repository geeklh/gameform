package com.springbootforh5.service.lmpl;

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

}
