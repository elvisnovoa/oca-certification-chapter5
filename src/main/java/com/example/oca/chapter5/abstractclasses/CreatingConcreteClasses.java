package com.example.oca.chapter5.abstractclasses;

public class CreatingConcreteClasses {

    public abstract class Eel {}

    // Abstract classes cannot be instatiated
    public void someMethod() {
//        final Eel eel = new Eel(); // DOES NOT COMPILE
    }

    public abstract class Animal {
        public abstract String getName();
    }

    // Concrete classes MUST implement any abstract methods they inherit
//    public class Walrus extends Animal {} // DOES NOT COMPILE

//    public class Bird extends Animal {} // DOES NOT COMPILE
    // Flamingo doesn't report any errors, but depends on Bird at compile time
//    public class Flamingo extends Bird {
//        public String getName() { return "Flamingo"; }
//    }
}
