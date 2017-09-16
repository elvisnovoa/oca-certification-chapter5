package com.example.oca.chapter5.interfaces;

public class InheritingInterfaces {

    public interface HasTail {
        int getTailLength(); // assumed public abstract
    }
    public interface HasWhiskers {
        int getNumberOfWhiskers(); // assumed public abstract
    }

    public interface Seal extends HasTail, HasWhiskers {}

    public abstract class HarborSeal implements HasTail, HasWhiskers {}

//    public class LeopardSeal implements HasTail, HasWhiskers {} // DOES NOT COMPILE

    public interface CanRun {}
//    public class Cheetah extends CanRun {} // DOES NOT COMPILE
    public class Hyena {}
//    public interface HasFur extends Hyena {} // DOES NOT COMPILE
//    public interface Runner implements CanRun {} // DOES NOT COMPILE
}
