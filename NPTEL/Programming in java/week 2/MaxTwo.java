import java.util.*;

public class MaxTwo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        if(a > b){
            System.out.println(a+" is greater than "+b);
        }
        else if(a==b){
            System.out.println(a+" is equal to "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
        sc.close();
    }
}