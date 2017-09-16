package com.example.oca.chapter5.interfaces;

public class DefaultInterfaceMethods {
    public interface IsWarmBlooded {
        boolean hasScales();
        default double getTemperature() {return 10.0;}
    }
    public interface Carnivore {
//        default void eatMeat(); // DOES NOT COMPILE
//        int getRequiredFoodAmount() {return 13;} // DOES NOT COMPILE
    }

    public interface HasFins {
        default int getNumberOfFins() {return 4;}
        default double getLongestFinLength() {return 20.0;}
        default boolean doFinsHaveScales() {return true;}
    }
    public interface SharkFamily extends HasFins {
        @Override
        default int getNumberOfFins() {return 8;} // normal override
        @Override
        double getLongestFinLength(); // replaces default with abstract
//        boolean doFinsHaveScales() {return false;} // DOES NOT COMPILE
    }
    public abstract class AbstractShark implements HasFins {
        @Override
        public int getNumberOfFins() {return 8;} // normal override
        @Override
        public abstract double getLongestFinLength(); // replaces default with abstract
    }
}
