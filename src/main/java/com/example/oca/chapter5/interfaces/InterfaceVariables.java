package com.example.oca.chapter5.interfaces;

public class InterfaceVariables {
    public interface CanSwim {
        int MAXIMUM_DEPTH = 100;
        final static boolean UNDERWATER =  true;
        public static final String TYPE = "Submersible";
    }
    public interface CanDig {
//        private int MAXIMUM_DEPTH = 100; // DOES NOT COMPILE
//        protected abstract boolean UNDERWATER =  true; // DOES NOT COMPILE
//        public static String TYPE; // DOES NOT COMPILE
    }
}
