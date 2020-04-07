package com.lihd.java.observer;

import java.util.Observable;

/**
 * @program: lihd-design-patterns
 * @description: 被观察者
 * @author: li_hd
 * @create: 2020-04-07 15:12
 **/
public class NumObservable extends Observable {

    private int data = 0;

    int getData() {
        return data;
    }

    public void setData(int data) {

        this.data = data;

        setChanged();

        notifyObservers(data);
    }
}
