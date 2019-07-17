package com.cybertek.day8;

import org.junit.Assert;
import org.junit.Test;

public class JavaTestNgDemo {

    @Test
    public void test1(){
        String a= "A";
        String b= "A";
        Assert.assertEquals(a,b);
    }
    @Test
    public void test2(){
        String str1= "apple";
        String str2= "orange";
        Assert.assertEquals(str1,str2);

    }
}
