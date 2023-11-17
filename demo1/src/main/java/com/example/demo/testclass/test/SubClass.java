package com.example.demo.testclass.test;

public class SubClass extends SuperClass{

    private String name;

    public SubClass() {

        System.out.println("SubClass 构造");
    }

    static {
        System.out.println("SubClass init");
    }

    public static void main(String[] args) {

        SuperClass sc = new SubClass();

        System.out.println("-------------------------------------------------------------");
    }

    public String test(String arg) {
        System.out.println("参数为：" + arg);
        return arg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SubClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
