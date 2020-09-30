package com.shiyan.spring03.anno.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.shiyan.spring03.anno.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.beans.PropertyVetoException;

@Configuration
@ComponentScan("com.shiyan.spring03.anno.dao")
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
public class SpringCofiguration {

    @Value("${jdbc.driverClass}")
    private String driverClass;

    @Value("${jdbc.jdbcUrl}")
    private String jdbcUrl;

    @Value("${jdbc.user}")
    private String user;

    @Value("${jdbc.password}")
    private String password;

    @Bean
    public ComboPooledDataSource comboPooledDataSource() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driverClass);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(ComboPooledDataSource comboPooledDataSource) {
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(comboPooledDataSource);
        return template;
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(ComboPooledDataSource comboPooledDataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(comboPooledDataSource);
        return dataSourceTransactionManager;
    }

    @Bean
    public UserDao userDao() {
        UserDao userDao = new UserDaoImpl();
        return userDao;
    }
}
