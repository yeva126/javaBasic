package com.company.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectReview {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c = Class.forName("com.company.Reflect.ReflectReviewObject");
        //创建实例
        ReflectReviewObject reflectObj = (ReflectReviewObject) c.newInstance();
        Method privateMethod = c.getDeclaredMethod("interview", String.class);
        privateMethod.setAccessible(true);
        Object privateMethodInvoke = privateMethod.invoke(reflectObj, "basketball");
        Field field = c.getDeclaredField("name");
        field.setAccessible(true);
        field.set(reflectObj, "Bob");
        privateMethod.invoke(reflectObj, "basketBall");
        Method publicMethod = c.getMethod("throwName", String.class);
        publicMethod.invoke(reflectObj, "Alice");
    }
}
