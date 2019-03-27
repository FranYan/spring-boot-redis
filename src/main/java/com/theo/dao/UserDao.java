package com.theo.dao;

import com.theo.entity.User;

public interface UserDao {

    User selectById(Long id);

}
