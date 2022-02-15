import java.util.Scanner;

class VariableMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row,col,count = 0;
        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();
        int[][] array = new int[row][];
        for(int i = 0; i < row; i++){
            System.out.print("Number of elements in row1: ");
            col = sc.nextInt();
            array[i] = new int[col];
            for(int j = 0; j < col; j++){
                array[i][j] = count;
                count++;
            }
        }

        for(int i = 0; i < row; i++){
            col = array[i].length;
            for(int j = 0; j < col; j++){
                System.out.print(array[i][j] +"  ");
            }
            System.out.println();
        }
    }
}