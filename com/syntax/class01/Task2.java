package com.syntax.class01;

import org.testng.annotations.*;

public class Task2 {
    @Test
    public void firstTest(){
        System.out.println("First test");
    }
    @Test
    public  void secondTest(){
        System.out.println("Second method");
    }
    @AfterClass
    public void  afterClass(){
        System.out.println("class close");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("class navigated");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("method close");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("method navigated");
    }
}
