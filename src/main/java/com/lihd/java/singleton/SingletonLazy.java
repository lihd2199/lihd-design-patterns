package com.lihd.java.singleton;

/**
 * @program: lihd-design-patterns
 * @description: 懒汉式单例
 * @author: li_hd
 * @create: 2020-04-07 14:39
 **/
public class SingletonLazy {


    private static volatile SingletonLazy instance = null;

    private SingletonLazy(){}

    public static synchronized SingletonLazy getInstance() {

        if(instance == null)
            instance = new SingletonLazy();

        return instance;
    }

}
