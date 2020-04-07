package com.lihd.java.prototype;

/**
 * @program: lihd-design-patterns
 * @description: 原型模式
 * @author: li_hd
 * @create: 2020-04-07 14:49
 **/
public class Prototype implements Cloneable {

    public Prototype() {
        System.out.println("具体原型创建成功！");
    }

    public Prototype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Prototype) super.clone();
    }


}



