package com.theo.service.impl;

import com.theo.dao.UserDao;
import com.theo.entity.User;
import com.theo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    @Resource
    private UserDao userDao;

    @Override
    public User getUser(Long id) {

        User user = userDao.selectById(id);

        return user;
    }

    @Override
    public List<User> getUsers() {
        return userDao.getAll();
    }
}
