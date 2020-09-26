package com.shiyan.spring02.test;

import com.shiyan.spring02.anno2.TargetInterface;
import com.shiyan.spring02.config.SpringAnnoCofiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringAnnoCofiguration.class)
public class AopAnno2Test {

    @Autowired
    private TargetInterface targetInterface;

    @Test
    public void test1() {
        targetInterface.save();
    }
}
