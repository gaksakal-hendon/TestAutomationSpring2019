package com.cybertek.day8;

import org.testng.annotations.*;

public class MixedAnnotationTesting {
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }
    @BeforeMethod
    public void setup(){
        System.out.println("before method");
    }
    @Test
    public void test1(){
        System.out.println("i am test1");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("after metot");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }
    @Test
    public void test2(){
        System.out.println("i am test2");
    }

}
