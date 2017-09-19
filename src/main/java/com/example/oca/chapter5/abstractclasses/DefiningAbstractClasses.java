package com.example.oca.chapter5.abstractclasses;

public class DefiningAbstractClasses {

    // Simple abstract class
    public abstract class Cow {}

    // Abstract classes cannot be final
//    public final abstract class Tortoise {} // DOES NOT COMPILE

    // Watch out for these on the exam
    // Any abstract method cannot have curly braces {} or a body
    public abstract class Turtle {
//        public abstract void swim() {} // DOES NOT COMPILE
//        public abstract int getAge() { // DOES NOT COMPILE
//            return 10;
//        }
    }

    // Abstract methods cannot be final
    public abstract class Goat {
//        public abstract final void chew(); // DOES NOT COMPILE
    }

    // Only abstract classes may have abstract methods
//    public class Chicken {
//        public abstract void peck(); // DOES NOT COMPILE
//    }

    // Abstract methods cannot be private
    public abstract class Whale {
//        private abstract void sing(); // DOES NOT COMPILE
//        protected abstract void sing(); // DOES NOT COMPILE
    }

    // Inheritance rules still apply,
    public class HumpbackWhale extends Whale {
        // this method cannot be of lower visibility than the one on the superclass
        private void sing() {
            System.out.println("Humpback whale is singing");
        }
    }
}
