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
        PolymorphismOverview.Lemur lemur = new PolymorphismOverview().new Lemur();

        PolymorphismOverview.Primate primate = lemur;
        System.out.println("primate.hasHair() = " + primate.hasHair());
//        System.out.println("primate.isTailStriped() = " + primate.isTailStriped()); // DOES NOT COMPILE

//        PolymorphismOverview.Lemur lemur2 = primate; // DOES NOT COMPILE
        PolymorphismOverview.Lemur lemur3 = (PolymorphismOverview.Lemur) primate;
        System.out.println("lemur3.age = " + lemur3.age);

        Rodent rodent = new Rodent();
        Capybara capybara = (Capybara) rodent; // Throws ClassCastException at runtime
    }
}
