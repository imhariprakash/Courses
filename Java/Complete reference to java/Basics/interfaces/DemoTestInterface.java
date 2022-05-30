public class DemoTestInterface{
    public static void main(String[] args){

        // normal implementing class variables - so access all methods and variables (not only variables and methods implemented from interface) 

        TestInterfaceClass1 t1 = new TestInterfaceClass1();
        TestInterfaceClass2 t2 = new TestInterfaceClass2();
        t1.callback(5);
        t2.callback(5);

        TestInterfaceClass1.print();
        TestInterfaceClass2.print();

        System.out.println("t1.a is " + t1.a);
        System.out.println("t2.a is " + t2.a); //interface variable a is final and cannot be reassigned - public static final int a = 4;

        System.out.println("t1.b is " + t1.b);
        System.out.println("t2.b is " + t2.b);

        // implementing interface variables - so access only variables and methods implemented from interface

        TestInterface t1_1 = new TestInterfaceClass1();
        TestInterface t2_1 = new TestInterfaceClass2();

        t1_1.callback(5);
        t2_1.callback(5);

        System.out.println("t1_1.a is " + t1_1.a);
        //System.out.println("t2_1.a is " + t2_1.a); //interface variable a is final and cannot be reassigned - public static final int a = 4;

        // System.out.println("t1_1.b is " + t1_1.b);
        // System.out.println("t2_1.b is " + t2_1.b);

        // t1_1.print();
        // t2_1.print();

        /* 


        DemoTestInterface.java:31: error: cannot find symbol
        System.out.println("t1_1.b is " + t1_1.b);
                                              ^
  symbol:   variable b
  location: variable t1_1 of type TestInterface
DemoTestInterface.java:32: error: cannot find symbol
        System.out.println("t2_1.b is " + t2_1.b);
                                              ^
  symbol:   variable b
  location: variable t2_1 of type TestInterface
DemoTestInterface.java:34: error: cannot find symbol
        t1_1.print();
            ^
  symbol:   method print()
  location: variable t1_1 of type TestInterface
DemoTestInterface.java:35: error: cannot find symbol
        t2_1.print();
            ^
  symbol:   method print()
  location: variable t2_1 of type TestInterface
4 errors

*/

    }
}