import java.util.Scanner;

class Sample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            
            for(int j = i; j < n; j++){
                System.out.print("  ");
            }

            for(int j = i; j > 0; j--){
                System.out.print(j + " ");
                //System.out.printf("%9d",j);
            }
            System.out.println();
        }
        sc.close();
    }
}