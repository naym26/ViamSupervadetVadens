package com.walking.task2;

import com.walking.task2.model.*;

public class Main {
    public static void main(String[] args) {
        Dog linda = new Dog();
        Cat evik = new Cat();
        Cow milka = new Cow();

        linda.woof();
        evik.meow();
        milka.moo();

        System.out.println("Через массив");
        Animal[] animals = new Animal[]{linda, evik, milka};

        for(Animal animal: animals) {
            switch (animal.getClass_name()){
                case Dog.class_dog:
                    ((Dog)animal).woof();
                    break;
                case Cat.class_cat:
                    ((Cat)animal).meow();
                    break;
                case Cow.class_cow:
                    ((Cow)animal).moo();
                default:
                    System.out.println("Неизвестное животное");
            }
        }
    }
}
