package com.springbootforh5.service;

import com.springbootforh5.model.MyResult;
import com.springbootforh5.model.User;

public interface UserService {
    MyResult login(User user);
}
