class MyThread extends Thread {
    public void run() {
        System.out.println("Goodbye from JVM");
    }
}

public class ShutDownHookExample {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new MyThread());
        System.out.println("Hello from JVM");
        try{
            Thread.sleep(10000);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}