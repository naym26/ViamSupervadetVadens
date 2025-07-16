package com.walking.task2.model;

public class Cat extends Animal{
    public static final String sound_cat = "meow";

    @Override
    public void sound(){
        System.out.println(sound_cat);
    }
}
