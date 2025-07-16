package com.walking.task2.model;

public class Cat extends Animal{
    public static final String class_cat = "CLASS_CAT";
    public static final String sound_cat = "meow";

    public Cat(){
        super(class_cat, sound_cat);
    }

    public void meow(){
        super.sound();
    }
}
