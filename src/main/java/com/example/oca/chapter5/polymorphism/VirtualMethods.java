package com.example.oca.chapter5.polymorphism;

public class VirtualMethods {

    public static class Bird {
        public String getName() {
            return "Unknown";
        }
        public void displayInformation() {
            System.out.println("this.getName() = " + this.getName());
        }
    }

    public static class Peacock extends Bird {
        @Override
        public String getName() {
            return "Peacock";
        }
    }

    public static void main(String[] args) {
        Bird bird = new Peacock();
        bird.displayInformation();
    }
}
