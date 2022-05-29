class DemoSuperClass{
    public static void main(String[] args){
        SuperClass s = new Subclass();
        s.method1();
        s.method2();
        s.method3();
        //s.method(); 

        System.out.println("s.a is " + s.a);
        System.out.println("s.b is " + s.b);
        //System.out.println("s.c is " + s.c);


        Subclass s1 = new Subclass();
        s1.method1();
        s1.method2();
        s1.method3();
        //s1.method();

        System.out.println("s1.a is " + s1.a);
        System.out.println("s1.b is " + s1.b);
        //System.out.println("s1.c is " + s1.c);

    }
}


// Superclass reference variables has only knowledge of variables and methods extended from Superclass 

// it doesn't know about variables and methods which are additionally added in subclass