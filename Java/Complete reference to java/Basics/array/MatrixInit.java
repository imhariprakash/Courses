import java.util.Scanner;

class MatrixInit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
        int count = 0;
        int[][] array = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                array[i][j] = count;
                count++;
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(array[i][j] +"  ");
            }
            System.out.println();
        }
    }
}