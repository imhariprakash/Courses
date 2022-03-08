import java.util.Scanner;
class PatternPrint{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print(" * ");
        }

        System.out.println();

        for(int i = 0; i < n; i++){
            System.out.print("*** ");
        }

        System.out.println();

        for(int i = 0; i < n; i++){
            System.out.print("*****");
        }
    }
}