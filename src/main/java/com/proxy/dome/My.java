package com.proxy.dome;

import java.lang.reflect.Method;

public class My implements Interceptor{
    public boolean before(Object o, Object object, Method method, Object[] args) {
        System.out.println("---前---");
        return true;
    }

    public void around(Object o, Object object, Method method, Object[] args) {
        System.out.println("---取代---");
    }

    public void after(Object o, Object object, Method method, Object[] args) {
        System.out.println("---后---");
    }
}
