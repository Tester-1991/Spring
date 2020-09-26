package com.shiyan.spring02.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.shiyan.spring02.config.SpringCofiguration;
import com.shiyan.spring02.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

public class SpringTest {

    @Test
    public void test1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();
    }

    @Test
    public void test2() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ComboPooledDataSource dataSource = (ComboPooledDataSource) applicationContext.getBean("dataSource");
        Connection conn = dataSource.getConnection();
        System.out.println(conn);
        conn.close();
    }

    @Test
    public void test3() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ComboPooledDataSource dataSource = (ComboPooledDataSource) applicationContext.getBean("dataSource2");
        Connection conn = dataSource.getConnection();
        System.out.println(conn);
        conn.close();
    }

    @Test
    public void test4() throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringCofiguration.class);
        ComboPooledDataSource dataSource = (ComboPooledDataSource) context.getBean("dataSource");
        Connection conn = dataSource.getConnection();
        System.out.println(conn);
        conn.close();
    }
}