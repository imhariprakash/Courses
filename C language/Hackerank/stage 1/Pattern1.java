import java.io.*;
import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print((char)(97 + j));
            }
            System.out.println();
        }
    }
}