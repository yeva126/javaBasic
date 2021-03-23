package com.company;

import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JdkProxyFactory {
    public static Object getProxy(Object o){
        return Proxy.newProxyInstance(
                o.getClass().getClassLoader(), //目标类
                o.getClass().getInterfaces(),  //代理需要实现的接口，可实现多个
                new DebugInvocationHandler(o)  //代理对象对应的自定义 InvocationHandler
        );
    }
}
