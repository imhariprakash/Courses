import java.util.Scanner;

public class OddEvenUsingThreads{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        Runnable odd = new Runnable() {
            public void run(){
                for (int i = start; i <= end; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
            }
        };

        Runnable even = new Runnable() {
            public void run(){
                for (int i = start; i <= end; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }
        };

        Thread t1 = new Thread(odd);
        Thread t2 = new Thread(even);

        t1.start();
        t2.start();
    }
}