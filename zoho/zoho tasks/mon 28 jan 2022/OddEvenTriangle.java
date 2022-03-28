import java.util.Scanner;
class OddEvenTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int odd = 1, even = 2;
        for(int row = 1; row <= rows; row++){
            for(int col = 1; col <=row; col++){
                if(row % 2 == 1){
                    System.out.print(odd + " ");
                    odd += 2;
                }
                else{
                    System.out.print(even + " ");
                    even += 2;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

/**
 

6
1 
2 4 
3 5 7 
6 8 10 12 
9 11 13 15 17 
14 16 18 20 22 24 

*/