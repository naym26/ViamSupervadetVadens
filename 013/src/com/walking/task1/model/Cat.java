package com.walking.task1.model;

public class Cat extends Animal{
    protected Cat(){
        System.out.println("I'm cat");
    }

    public Cat(String p_color){
        this();
        System.out.printf("I'm a %s cat\n", p_color);
    }
}
