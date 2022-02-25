import java.util.Scanner;
class PrimeFinding{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        isPrime(n);
    }

    public static void isPrime(int n){
        if(n % 2 == 0){
            System.out.println("Not a Prime number.");
            return;
        }
        for(int i = 3; i < n; i= i + 2){
            if(n % i == 0){
                System.out.println("Not a Prime number.");
                return;
            }
        }
        System.out.println("prime number.");
    }
}