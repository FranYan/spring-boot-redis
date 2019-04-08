package com.theo.dao;

import com.theo.entity.User;

import java.util.List;

public interface UserDao {

    User selectById(Long id);

    List<User> getAll();

}
