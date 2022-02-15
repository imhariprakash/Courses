import java.util.Scanner;
import java.util.Arrays;

class Matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
        int[][] array = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print("Enter element of row "+(i+1)+" column "+(j+1)+" : ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i = 0; i < row; i++){
            System.out.println(Arrays.toString(array[i]));
        }

        sc.close();
    }
}