package com.example.oca.chapter5.abstractclasses;

public class AbstractClassesOverview {
    public abstract class Animal {
        protected int age;
        public void eat() {
            System.out.println(getName() + " is eating");
        }
        public abstract String getName();
    }

    public class Swan extends Animal {
        public String getName() {
            return "Swan";
        }
    }
}
