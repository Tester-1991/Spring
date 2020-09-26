package com.shiyan.spring02.aop;

public class Target implements TargetInterface {
    @Override
    public void save() {
        System.out.println("save ...");
    }
}
