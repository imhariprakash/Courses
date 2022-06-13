// Create multiple threads.
class NewThread implements Runnable {

  String name; // name of thread
  Thread t;

  NewThread(String threadname) {
    name = threadname;
    t = new Thread(this, name);
    System.out.println("New thread: " + t);
  }

  // This is the entry point for thread.
  public void run() {
    try {
      for (int i = 5; i > 0; i--) {
        Thread.sleep(1000);
        System.out.println(name + ": " + i);
      }
    } catch (InterruptedException e) {
      System.out.println(name + "Interrupted");
    }
    System.out.println(name + " exiting.");
  }
}

class MultiThreadDemo {

  public static void main(String[] args) {
    NewThread nt1 = new NewThread("One");
    NewThread nt2 = new NewThread("Two");
    NewThread nt3 = new NewThread("Three");
    // Start the threads.
    nt1.t.start();
    nt2.t.start();
    nt3.t.start();
    try {
      // wait for other threads to end
      Thread.sleep(1);
    } catch (InterruptedException e) {
      System.out.println("Main thread Interrupted");
    }
    System.out.println("Main thread exiting.");

    while(true){                                             // observation : multicore - running simultaneously in multiple threads
      System.out.println("Main thread running");
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        System.out.println("Main thread Interrupted");
      }
    }
  }
}
