package com.lihd.java;

import com.lihd.java.observer.NumObservable;
import com.lihd.java.observer.NumObserver;
import org.junit.Test;

/**
 * @program: lihd-design-patterns
 * @description: 观察者模式
 * @author: li_hd
 * @create: 2020-04-07 15:19
 **/
public class ObservableTest {



    @Test
    public void test(){

        final NumObservable numObservable = new NumObservable();

        final NumObserver numObserver = new NumObserver();

        numObserver.register(numObservable);

        numObservable.setData(2);

        System.out.println("end");


    }




}
