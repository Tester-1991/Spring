package com.shiyan.spring02.anno2;

import org.springframework.stereotype.Component;

@Component
public class Target implements TargetInterface {
    @Override
    public void save() {
        System.out.println("save ...");
    }
}
