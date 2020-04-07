package com.lihd.java.singleton;

/**
 * @program: lihd-design-patterns
 * @description: 饿汉式单例
 * @author: li_hd
 * @create: 2020-04-07 14:42
 **/
public class SingletonHungry {

    private static final SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {}

    public static SingletonHungry getInstance() {
        return instance;
    }
}
