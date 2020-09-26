package com.shiyan.spring02.test;

import com.shiyan.spring02.anno.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_anno.xml")
public class AopAnnoTest {

    @Autowired
    private TargetInterface targetInterface;

    @Test
    public void test1(){
        targetInterface.save();
    }
}
