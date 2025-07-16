package com.walking.task2.model;

public class Dog extends Animal{
    public static final String class_dog = "CLASS_DOG";
    public static final String sound_dog = "woof";

    public Dog(){
        super(class_dog, sound_dog);
    }

    public void woof(){
        sound();
    }
}
