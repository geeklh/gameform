package com.geekli.service.lmpl;


//import com.alibaba.fastjson.JSONObject;
//import com.alipay.api.CertAlipayRequest;
//import com.geekli.dao.BackServiceOperation;
//import com.geekli.dao.UserBehavior;

import com.geekli.dao.UserMapper;
import com.geekli.model.*;
import com.geekli.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Member;
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
        list = (List<User>) userMapper.login(user);

        MyResult result = new MyResult();
        if (list.size() != 0) {
            result.setCode(0);
            result.setMsg("登录成功");
            result.setObj(list.get(0));
        } else {
            result.setCode(1);
            result.setMsg("登录失败");
        }
        return result;
    }
}
