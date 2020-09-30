package com.shiyan.spring03.anno.dao.impl;

import com.shiyan.spring03.anno.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    @Override
    public void save() {
        System.out.println("save...");
        jdbcTemplate.update("update user set username=? where id=41", "1234");
        int i = 1 / 0;
    }
}
