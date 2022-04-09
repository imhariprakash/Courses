import java.util.Scanner;

class code22{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j =  1, count = i; j <= n; j++){
                count = count > n ? 1 : count;
                System.out.print(count++ + " ");
            }
            

            System.out.println();
        }
    }
}