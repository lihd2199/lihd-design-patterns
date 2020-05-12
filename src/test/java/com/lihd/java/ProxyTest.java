package com.lihd.java;

import com.lihd.java.proxy.IProxy;
import com.lihd.java.proxy.JDKProxy;
import com.lihd.java.proxy.Proxy2;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @program: lihd-design-patterns
 * @description:
 * @author: li_hd
 * @create: 2020-05-12 10:52
 **/
public class ProxyTest {

    @Test
    public void test() {

        final Proxy2 proxy2 = new Proxy2();


        final JDKProxy jdkProxy = new JDKProxy();

        jdkProxy.setTarget(proxy2);

        final IProxy proxyInstance = (IProxy) Proxy.newProxyInstance(proxy2.getClass().getClassLoader(),
                proxy2.getClass().getInterfaces(), jdkProxy);

        final Class<?>[] interfaces = proxyInstance.getClass().getInterfaces();

        System.out.println(interfaces.length);

        System.out.println(proxyInstance.test());

    }

}
