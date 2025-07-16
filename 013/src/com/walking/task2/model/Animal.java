package com.walking.task2.model;

public class Animal {
    private String class_name;
    private String sound;

    protected Animal(String p_class_name, String p_sound){
        this.class_name = p_class_name;
        this.sound = p_sound;
    }

    public String getClass_name() {
        return class_name;
    }

    protected void sound(){
        System.out.println(sound);
    }
}
