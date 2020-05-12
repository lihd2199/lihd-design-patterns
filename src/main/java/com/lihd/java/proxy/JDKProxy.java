package com.lihd.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: lihd-design-patterns
 * @description:
 * @author: li_hd
 * @create: 2020-05-12 10:48
 **/
public class JDKProxy implements InvocationHandler {


    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        final Object invoke = method.invoke(target, args);

        return invoke;
    }
}
