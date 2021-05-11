package com.company.Java_sem2.task5;

public class EagerSingleton {
    public static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){};

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }
}