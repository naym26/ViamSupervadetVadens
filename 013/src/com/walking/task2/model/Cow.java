package com.walking.task2.model;

public class Cow extends Animal{
    public static final String class_cow = "CLASS_COW";
    public static final String sound_cow = "moo";

    public Cow(){
        super(class_cow, sound_cow);
    }

    public void moo(){
        super.sound();
    }
}
