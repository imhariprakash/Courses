// This is now correct.
class ThrowsDemoCorrect {

  static void throwOne(int a) throws IllegalAccessException, ArithmeticException {
    System.out.println("Inside throwOne.");
    if (a % 2 == 0) {
      throw new IllegalAccessException("demo");
    }

    throw new ArithmeticException("Arithmetic error");
  }

  public static void main(String[] args) {
    try {
      throwOne(1);
    } catch (IllegalAccessException e) {
      System.out.println("Caught " + e);
    } catch (Exception e) {
      System.out.println("Caught " + e);
    }
  }
}
