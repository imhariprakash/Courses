/*   error not handled
class Exc1 {

  static void subroutine() {
    int d = 0;
    int a = 10 / d;
  }

  public static void main(String[] args) {
    Exc1.subroutine();
  }
}

*/

class Exc1 {

  public static void main(String[] args) {
    int d, a;
    try { // monitor a block of code.
      d = 0;
      a = 42 / d;
      System.out.println("This will not be printed.");
    } catch (ArithmeticException e) { // catch divide-by-zero error
      System.out.println("Division by zero.");
    }
    System.out.println("After catch statement.");
  }
}
