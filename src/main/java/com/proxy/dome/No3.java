package com.proxy.dome;

import java.lang.reflect.Method;

public class No3 implements Interceptor{
    public boolean before(Object o, Object object, Method method, Object[] args) {
    System.out.println("---No3---");
    return true;
}

    public void around(Object o, Object object, Method method, Object[] args) {
    }

    public void after(Object o, Object object, Method method, Object[] args) {
        System.out.println("---No3---");
    }
}
