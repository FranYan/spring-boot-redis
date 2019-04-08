package com.theo.components;

import com.theo.entity.User;
import com.theo.service.UserService;
import com.theo.service.impl.UserServiceImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

@EnableTransactionManagement
public class RedisListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {

        UserService userService = new UserServiceImpl();
        User user = userService.getUser(1L);

        System.out.println(user.toString());
    }
}
