package com.geekli.service;


import com.geekli.model.*;

import javax.servlet.http.HttpSession;
import java.util.List;


public interface UserService {
    MyResult login(User user);
}
