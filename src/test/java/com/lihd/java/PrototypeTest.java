package com.lihd.java;

import com.lihd.java.prototype.Prototype;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-design-patterns
 * @description: 克隆模式
 * @author: li_hd
 * @create: 2020-04-07 14:52
 **/
public class PrototypeTest {


    /**
     * 克隆模式测试
     */
    @Test
    public void test() throws CloneNotSupportedException {


        Prototype prototype = new Prototype();

        final Prototype clone = prototype.clone();

        Assert.assertNotEquals(prototype, clone);


    }


}
