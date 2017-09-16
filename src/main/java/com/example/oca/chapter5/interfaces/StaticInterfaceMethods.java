package com.example.oca.chapter5.interfaces;

public class StaticInterfaceMethods {
    public interface CanHop {
        static int getJumpHeight() {return 8;}
    }
    public class Rabbit implements CanHop {
        public void printDetails() {
//            System.out.println(getJumpHeight()); // DOES NOT COMPILE
            System.out.println(CanHop.getJumpHeight());
        }
    }
}
