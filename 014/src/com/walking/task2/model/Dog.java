package com.walking.task2.model;

public class Dog extends Animal{
    public static final String sound_dog = "woof";

    @Override
    public void sound(){
        System.out.println(sound_dog);
    }
}
