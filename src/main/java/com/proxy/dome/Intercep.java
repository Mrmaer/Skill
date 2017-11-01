package com.proxy.dome;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@AllArgsConstructor
public class Intercep implements InvocationHandler{
    private Object target;
    private String name = null;

    public static Object bind(Object o,String name){
        return Proxy.newProxyInstance(o.getClass().getClassLoader(),
                o.getClass().getInterfaces(),new Intercep(o,name));
    }
    
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (name == null)
            return method.invoke(target,args);

        Object object = null;

        Interceptor interceptor = (Interceptor) Class.forName(name).newInstance();

        if (interceptor.before(proxy,target,method,args)){
            object = method.invoke(target,args);
        }else{
            interceptor.around(proxy,target,method,args);
        }

        interceptor.after(proxy,target,method,args);
        return object;
    }
}
