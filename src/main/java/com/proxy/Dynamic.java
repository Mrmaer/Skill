package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Dynamic implements InvocationHandler{

    private Object object = null;
    public Object bind(Object object){
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理模式");
        System.out.println("开始");
        Object o = method.invoke(object,args);
        System.out.println("结束");
        return o;
    }
}
