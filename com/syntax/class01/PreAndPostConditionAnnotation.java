package com.syntax.class01;

import org.testng.annotations.*;

public class PreAndPostConditionAnnotation {

    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class annotation");
    }
    @Test
    public void test(){
        System.out.println("I am a test method");
    }

    @Test
    public void testMethod(){
        System.out.println("I am second test method");
    }
    @Test
    public void testMethod3(){
        System.out.println("i am third method");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("i am after class");
    }
}
