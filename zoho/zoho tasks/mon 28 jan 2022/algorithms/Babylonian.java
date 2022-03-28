import java.util.Scanner;

class Babylonian{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        double guess  = 1;
        double error = 0.0000000000001;

        while(error < abs(guess * guess - num)){
            guess = 0.5 * (guess + (num / guess));
        }

        System.out.print(guess);

        sc.close();
    }

    public static double abs(double num){
        return(num < 0 ? -num : num);
    }
}