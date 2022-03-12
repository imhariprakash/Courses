import java.util.Scanner;
class Recursion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        n = recursive(n);
        System.out.println("Ans : " + n);
    }

    public static int recursive(int n){
        if(n == 0){
            return 1;
        }
        else{
            return(n * recursive(n - 1));
        }
    }
}