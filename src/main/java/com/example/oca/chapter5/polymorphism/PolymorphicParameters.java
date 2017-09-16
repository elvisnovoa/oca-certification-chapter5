package com.example.oca.chapter5.polymorphism;

public class PolymorphicParameters {
    public static class Reptile {
        public String getName() {
            return "Reptile";
        }
    }
    public static class Alligator extends Reptile {
        @Override
        public String getName() {
            return "Alligator";
        }
    }
    public static class Crocodile extends Reptile {
        @Override
        public String getName() {
            return "Crocodile";
        }
    }

    public static class ZooWorker {
        public void feed(Reptile reptile) {
            System.out.println("Feeding: " + reptile.getName());
        }
    }

    public static void main(String[] args) {
        ZooWorker zooWorker = new ZooWorker();
        zooWorker.feed(new Alligator());
        zooWorker.feed(new Crocodile());
        zooWorker.feed(new Reptile());
    }
}
