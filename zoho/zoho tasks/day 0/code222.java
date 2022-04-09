import java.util.Scanner;

class code222{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j =  i; j <= n; j++){
                System.out.print(j + " ");
            }

            for(int j = 1; j < i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
            

            System.out.println();
        }
    }
}