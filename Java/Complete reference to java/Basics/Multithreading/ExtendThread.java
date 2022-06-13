// Create a second thread by extending Thread
class NewThread extends Thread {

  NewThread() {
    // Create a new, second thread
    super("Demo Thread");
    System.out.println("Child thread: " + this);
  }

  // This is the entry point for the second thread.
  public void run() {
    try {
      for (int i = 5; i > 0; i--) {
        System.out.println("Child Thread: " + i);
        Thread.sleep(500);
      }
    } catch (InterruptedException e) {
      System.out.println("Child interrupted.");
    }
    System.out.println("Exiting child thread.");
  }
}

class ExtendThread {

  public static void main(String[] args) {
    NewThread nt = new NewThread(); // create a new thread
    nt.start(); // start the thread         // unlike runnable implementation, nt.t.start() is not used here because nt is not a thread object so start is not applicable 
    try {                                   // here we are using start() method of thread class to start the thread since nt is a thread object
      for (int i = 5; i > 0; i--) {
        System.out.println("Main Thread: " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println("Main thread interrupted.");
    }
    System.out.println("Main thread exiting.");
  }
}
