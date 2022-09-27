class ThreadSheduler implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class PriorityThreadSheduler {
    public static void main(String[] args){
        ThreadSheduler a = new ThreadSheduler();
        Thread t1 = new Thread(a, "First Thread");
        Thread t2 = new Thread(a, "Second Thread");
        Thread t3 = new Thread(a, "Third Thread");
        
        t1.setPriority(4); // Setting the priority of first thread.
        t2.setPriority(2); // Setting the priority of second thread.
        t3.setPriority(9); // Setting the priority of third thread.
        
        t1.start();
        t2.start();
        t3.start();
    }
}