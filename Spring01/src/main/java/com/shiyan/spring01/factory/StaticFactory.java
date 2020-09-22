package com.shiyan.spring01.factory;

import com.shiyan.spring01.dao.UserDao;
import com.shiyan.spring01.dao.impl.UserDaoImpl;

public class StaticFactory {

    public static UserDao getUserDao() {
        System.out.println("StaticFactory getUserDao");
        return new UserDaoImpl();
    }
}
