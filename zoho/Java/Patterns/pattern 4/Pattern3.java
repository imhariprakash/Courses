import java.util.Scanner;
class Pattern3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = i; j < n; j++){
                System.out.print("   ");
            }
            for(int j = 1, count = i; j <= i; j++,count = count + n - j + 1){
                System.out.printf("%3d", count);
            }
            System.out.println(" ");
        }
    }
}