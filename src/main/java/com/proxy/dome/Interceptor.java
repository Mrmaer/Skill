package com.proxy.dome;

import java.lang.reflect.Method;

public interface Interceptor {
    public boolean before(Object o, Object object, Method method,Object[] args);
    public void around(Object o, Object object, Method method,Object[] args);
    public void after(Object o, Object object, Method method,Object[] args);
}
