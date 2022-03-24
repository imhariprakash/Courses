import java.util.Scanner;

class Pattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 3 * n - 3;
        int l = 4 * n - 4;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(i == 0 || j == n - 1){
                    System.out.print(i + j + 1 + " ");
                }
                else if(j == 0){
                    System.out.print(l-- + " ");
                }
                else if(i == n - 1){
                    System.out.print(k-- + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}