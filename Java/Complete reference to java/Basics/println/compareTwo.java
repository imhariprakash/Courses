import java.util.*;

class compareTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        if(a > b){
            System.out.print("A is greater than B.");
        }
        else if(b > a){
            System.out.print("B is greater than A.");
        }
        else{
            System.out.print("A and B are equal.");
        }
    }
}