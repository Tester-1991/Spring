package com.shiyan.spring01.factory;

import com.shiyan.spring01.dao.UserDao;
import com.shiyan.spring01.dao.impl.UserDaoImpl;

public class DynamicFactory {

    public UserDao getUserDao(){
        System.out.println("DynamicFactory getUserDao");
        return new UserDaoImpl();
    }
}
