package com.example.oca.chapter5.polymorphism;

public class PolymorphismOverview {
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

        public void doSomething() {
            Lemur lemur = new Lemur();
            System.out.println("lemur.age = " + lemur.age);

            HasTail hasTail = lemur;
            System.out.println("hasTail.isTailStriped() = " + hasTail.isTailStriped());
//            System.out.println("hasTail.age = " + hasTail.age); // DOES NOT COMPILE

            Primate primate = lemur;
            System.out.println("primate.hasHair() = " + primate.hasHair());
//        System.out.println("primate.isTailStriped() = " + primate.isTailStriped()); // DOES NOT COMPILE
        }
    }
}
