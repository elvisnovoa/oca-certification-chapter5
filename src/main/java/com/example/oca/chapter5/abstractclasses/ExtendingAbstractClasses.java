package com.example.oca.chapter5.abstractclasses;

public class ExtendingAbstractClasses {
    public abstract class Animal {
        public abstract String getName();
        public abstract boolean eatsMeat();
    }

    public abstract class BigCat extends Animal {
        public abstract void roar();
        public boolean eatsMeat() {
            return true;
        }
    }

    // Needs to implement abstract methods from both Animal and BigCat
    // Does not need to implement eatsMeat because BigCat already did
    public class Lion extends BigCat {
        public String getName() {
            return "Lion";
        }
        public void roar() {
            System.out.println("Meow!!");
        }
    }
}
