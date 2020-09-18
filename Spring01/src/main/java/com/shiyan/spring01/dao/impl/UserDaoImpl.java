package com.shiyan.spring01.dao.impl;

import com.shiyan.spring01.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save running...");
    }
}
