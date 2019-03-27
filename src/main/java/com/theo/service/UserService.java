package com.theo.service;

import com.theo.entity.User;

import java.util.List;

public interface UserService {

    User getUser(Long id);

    List<User> getUsers();

}
