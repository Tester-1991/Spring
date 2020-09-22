package com.shiyan.spring02.service.impl;

import com.shiyan.spring02.dao.UserDao;
import com.shiyan.spring02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void save() {
        userDao.save();
    }
}
