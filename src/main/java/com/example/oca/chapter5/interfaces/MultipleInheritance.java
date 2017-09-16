package com.example.oca.chapter5.interfaces;

public class MultipleInheritance {
    // ---------------------------------- Part 1 ---------------------------------- //
    // Bear.eatPlants() satisfies both Omnivore.eatPlants() and Herbivore.eatPlants() simultaneously
    public interface Herbivore {
        void eatPlants();
    }
    public interface Omnivore {
        void eatPlants();
        void eatMeat();
    }
    public class Bear implements Herbivore, Omnivore {
        @Override
        public void eatPlants() {
            System.out.println("Eating plants");
        }
        @Override
        public void eatMeat() {
            System.out.println("Eating meat");
        }
    }

    // ---------------------------------- Part 2 ---------------------------------- //
    // even slightly different signatures require individual implementations
    public interface Herbivore2 {
        void eatPlants(int quantity);
    }
    public interface Omnivore2 {
        void eatPlants();
    }
    public class Bear2 implements Herbivore2, Omnivore2 {
        @Override
        public void eatPlants(int quantity) {
            System.out.println("Eating " + quantity + " plants");
        }
        @Override
        public void eatPlants() {
            System.out.println("Eating plants");
        }
    }

    // ---------------------------------- Part 3 ---------------------------------- //
    // methods with different erasure may not be inherited together
    public interface Herbivore3 {
        int eatPlants();
    }
    public interface Omnivore3 {
        void eatPlants();
    }
    /*public class Bear3 implements Herbivore3, Omnivore3 { // DOES NOT COMPILE
        @Override
        public int eatPlants() { // DOES NOT COMPILE
            System.out.println("Eating 10 plants");
            return 10;
        }
        @Override
        public void eatPlants() { // DOES NOT COMPILE
            System.out.println("Eating plants");
        }
    }
    public interface Supervore extends Herbivore3, Omnivore3 {} // DOES NOT COMPILE
    public abstract class AbstractBear implements Herbivore3, Omnivore3 {} // DOES NOT COMPILE*/
}
