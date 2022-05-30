public class TestInterfaceClass2 implements TestInterface {
    int b = 2;
    
    public void callback(int p) {
        System.out.println("TestInterfaceClass2.callback(int)");
        //a = 5; final int a cannot be reassigned
        System.out.println("p squared is " + (p * p * a));
    }

    public static void print(){
        System.out.println("Hello world");
    }

}