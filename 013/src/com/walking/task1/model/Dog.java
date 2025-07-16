package com.walking.task1.model;

public class Dog extends Animal{
    protected Dog(){
        super();
        System.out.println("I'm a dog");
    }

    public Dog(String p_color){
        this();
        System.out.printf("I'm a %s dog\n", p_color);
    }
}
