// Another implementation of Callback.
class AnotherClient implements Callback {

  // Implement Callback's interface
  public void callback(int p) {
    System.out.println("Another version of callback");
    System.out.println("p squared is " + (p * p));
  }
}

class TestIface2 {

  public static void main(String[] args) {
    Callback c = new Client();
    AnotherClient ob = new AnotherClient();
    c.callback(42);
    c = ob; // c now refers to AnotherClient object
    c.callback(42);
  }
}