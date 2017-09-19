package com.example.oca.chapter5.polymorphism;

public class CastingObjects {

    public class Bird {}

    public class Fish {
        public void doSomething() {
            Fish fish = new Fish();
//            Bird bird = (Bird) fish; // DOES NOT COMPILE
        }
    }

    public static class Rodent {}
    public static class Capybara extends Rodent {}

    public static void main(String[] args) {
        // Ignore instatiation notation, this is a result of using inner classes
        Lemur lemur = new Lemur();
        Primate primate = lemur;

//        Lemur lemur2 = primate; // DOES NOT COMPILE
        Lemur lemur3 = (Lemur) primate;
        System.out.println("lemur3.age = " + lemur3.age);

        Rodent rodent = new Rodent();
        Capybara capybara = (Capybara) rodent; // Throws ClassCastException at runtime
    }

    public static class Primate {
        public boolean hasHair() {
            return true;
        }
    }
    public interface HasTail {
        boolean isTailStriped();
    }
    public static class Lemur extends Primate implements HasTail {
        @Override
        public boolean isTailStriped() {
            return false;
        }

        public int age = 10;
    }
}
