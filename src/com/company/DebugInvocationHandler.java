package com.company;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *  JDK 动态代理类
*/
public class DebugInvocationHandler implements InvocationHandler {
    private final Object object;

    public DebugInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method:" + method.getName());
        Object res = method.invoke(object, args);
        System.out.println("after method:"+ method.getName());
        return res;
    }
}
