package P10_IntroducingNestedAndInnerClasses;

// This program will not compile.

/*
    class Outer2 {
        int outer_x = 100;

        void test() {
            Inner2 inner = new Inner2();
            inner.display();
        }

        // This is an inner class.
        class Inner2 {
            int y = 10; // y is local to Inner.

            void display() {
                System.out.println("display: outer_x = " + outer_x);
            }
        }

        void showy() {
            System.out.println(y); // Error, y not known here!
        }
    }

    class InnerClassDemo2 {
        public static void main(String args[]) {
            Outer2 outer = new Outer2();
            outer.test();
        }
    }
*/
