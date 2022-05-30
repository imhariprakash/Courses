public class TestInterfaceClass1 implements TestInterface {
    int a = 5;  // created a class variable not reassigning the interface variable which is final
    int b = 1;
    
    public void callback(int p) {
        System.out.println("TestInterfaceClass1.callback(int)");
        System.out.println("p squared is " + (p * p));
    }

    public static void print(){
        System.out.println("Hello world");
    }


}