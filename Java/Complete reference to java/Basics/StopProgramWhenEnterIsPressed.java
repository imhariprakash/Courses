import java.util.Scanner;

class StopProgramWhenEnterIsPressed {

  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    do {
      String word = sc.nextLine();
      System.out.println(word);
      if (word.equals("")) {
        break;
      }
    } while (true);
  }
}
