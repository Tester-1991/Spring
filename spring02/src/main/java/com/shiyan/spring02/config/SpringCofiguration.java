package com.shiyan.spring02.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;

@Configuration
@ComponentScan("com.shiyan.spring02")
@Import(DataSourceCofiguration.class)
public class SpringCofiguration {

}
