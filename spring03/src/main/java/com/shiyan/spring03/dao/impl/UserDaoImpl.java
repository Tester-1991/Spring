package com.shiyan.spring03.dao.impl;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.shiyan.spring03.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save() {
        System.out.println("save...");
        jdbcTemplate.update("update user set username=? where id=41", "石岩1991");
        int i = 1 / 0;
    }
}
