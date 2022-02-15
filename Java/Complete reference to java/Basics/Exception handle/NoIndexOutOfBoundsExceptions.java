import java.util.*;

public class NoIndexOutOfBoundsExceptions {

    public static void main(String[] args) {
        int[] hardCodedArray = { 3, 2, 4, 5, 1 };

        Scanner scanner = new Scanner(System.in);

        int index = scanner.nextInt();

        if (index < 0 || index > hardCodedArray.length - 1) {
            System.out.println("The index is out of bounds.");
        } else {
            System.out.println(hardCodedArray[index]);
        }

        scanner.close();
    }
}