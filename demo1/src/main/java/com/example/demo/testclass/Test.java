package com.example.demo.testclass;

import com.example.demo.testclass.test.SubClass;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {


        Class clz = Class.forName("com.example.demo.testclass.test.SubClass");


        Method method = clz.getDeclaredMethod("test", String.class);

        Object o = clz.newInstance();

        long t1 = System.nanoTime();
        String s1 = (String) method.invoke(o, "test");
        System.out.println(s1);
        System.out.println("-------------------------------------");


        System.out.println(System.nanoTime() - t1);
        long t2 = System.nanoTime();

        SubClass s = new SubClass();
        String s2 = s.test("test");
        System.out.println(s2);
        System.out.println("-------------------------------------");


        System.out.println(System.nanoTime() - t2);


        System.out.println("======================================");



        Field f = clz.getDeclaredField("name");
        f.setAccessible(true);
        f.set(o, "test");
        f.setAccessible(false);
        System.out.println(o);




    }

}
