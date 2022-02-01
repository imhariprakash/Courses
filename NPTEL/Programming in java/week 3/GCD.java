import java.util.*;

class GCD{
    static int gcd(int m, int n){
        if(m==0)
            return(n);
        if(n==0)
            return(m);
        else
            return(gcd(n,m%n));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int m = sc.nextInt();
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(gcd(m,n));
        sc.close();
    }
}