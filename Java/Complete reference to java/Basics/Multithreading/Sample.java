class Sample extends Thread {
    public void run() {
        System.out.println("Hello World");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Thread interrupted");
        }
    }
    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println(s.isAlive() + " " + s.getState());
        s.start();
        System.out.println(s.isAlive() + " " + s.getState());
        System.out.println("Main thread");
        //s.start(); - can't start a thread twice
        try{
            s.join();
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println(s.getState());
    }
}