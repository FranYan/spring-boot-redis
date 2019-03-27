package com.theo.controller;

import com.theo.Util.ResultBean;
import com.theo.config.RedisUtil;
import com.theo.entity.User;
import com.theo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/{id}")
    public ResultBean getUserById(@PathVariable Long id) {

        User user = userService.getUser(id);

        for (int i = 0; i < 100; i++) {
            redisUtil.set(user.getUsername() + i, user);
        }
        return new ResultBean("success", user);
    }

}
