import java.util.*;

public class RecursiveFact{
    int n;
    int factorial(int n){
        if(n==0)
            return 1;
        else
            return(n*factorial(n-1));
    }

    public static void main(String args[]){
        RecursiveFact x = new RecursiveFact();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is :"+x.factorial(n));
        sc.close();
    }    
}