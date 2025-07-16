package com.walking.task2;

import com.walking.task2.model.*;

public class Main {
    public static void main(String[] args) {
        Dog linda = new Dog();
        Cat evik = new Cat();
        Cow milka = new Cow();

        linda.sound();
        evik.sound();
        milka.sound();

        System.out.println("Через массив");
        Animal[] animals = new Animal[]{linda, evik, milka};

        for(Animal animal: animals) {
            animal.sound();
        }
    }
}
