import java.util.*;

class Fibonacci{
    static int fibonacci(int n){        //made as static else i need to create object instances
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return(fibonacci(n-1) + fibonacci(n-2));
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n) +" is the element number "+n+" of the fibonacci series.");
        sc.close();
    }
}