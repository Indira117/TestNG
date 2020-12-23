package com.syntax.class01;

import org.testng.annotations.Test;

public class TestNGIntro {
    @Test(priority = 1)
    public void sayHello(){
        System.out.println("Hello");
    }
@Test (priority = 3)
    public void sayBye(){
        System.out.println("Bye");
    }
    @Test (priority = 2)
    public void howAreYou(){
        System.out.println("How are you?");
    }

}
