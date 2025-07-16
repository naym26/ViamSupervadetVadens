package com.walking.task2.model;

public class Cow extends Animal{
    public static final String sound_cow = "moo";

    @Override
    public void sound(){
        System.out.println(sound_cow);
    }
}
