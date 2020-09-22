package com.shiyan.spring02.dao.impl;

import com.shiyan.spring02.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save...");
    }
}
