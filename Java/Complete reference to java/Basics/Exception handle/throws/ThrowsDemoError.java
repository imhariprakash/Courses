// This program contains an error and will not compile.
class ThrowsDemoError { // throw new Error("Error thrown in ThrowsDemoError"); using throws keyword

  static void throwOne() {
    System.out.println("Inside throwOne.");
    throw new IllegalAccessException("demo");
  }

  public static void main(String[] args) {
    throwOne();
  }
}
