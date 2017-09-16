package com.example.oca.chapter5.interfaces;

public class InterfaceOverview {

    /*
        -Interfaces are always abstract, keyword assumed
        -Interface variables are always public, static and final
        -Interface methods are always public and abstract
     */
    public abstract interface CanBurrow {
        public static final int MINIMUM_DEPTH = 2;
        public abstract int getMaximumDepth();
    }

    public class FieldMouse implements CanBurrow {
        @Override // for safety
        public int getMaximumDepth() {
            return MINIMUM_DEPTH;
        }
    }

    public interface WalksOnFourLegs {}
    public interface HasTrunk {}
    public interface Herbivore {}
    public class Elephant implements WalksOnFourLegs, HasTrunk, Herbivore {}
}
