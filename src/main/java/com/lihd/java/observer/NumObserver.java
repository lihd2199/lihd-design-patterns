package com.lihd.java.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: lihd-design-patterns
 * @description: 观察者
 * @author: li_hd
 * @create: 2020-04-07 15:17
 **/
public class NumObserver implements Observer {


    public void register(Observable observable) {
        observable.addObserver(this);
    }


    public void update(Observable o, Object arg) {

        NumObservable numObservable = (NumObservable) o;

        System.out.println("data has changed to " + numObservable.getData());

    }


}
