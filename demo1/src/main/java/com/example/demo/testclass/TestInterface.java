package com.example.demo.testclass;

public interface TestInterface {

    default void test() {

        System.out.println("11111111");
    }


    Integer test = 1;

    public Integer test2 = 2;

    void test2();


}
