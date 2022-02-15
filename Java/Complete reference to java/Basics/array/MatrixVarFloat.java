import java.util.Scanner;

class MatrixVarFloat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        float count = 0.0f;
        float[][] array = new float[row][];
        for(int i = 0; i < row; i++){
            System.out.print("Enter the number of columns: ");
            int col = sc.nextInt();
            array[i] = new float[col];
            for(int j = 0; j < col; j++){
                array[i][j] = count;
                count++;
            }
        }

        for(int i = 0; i < row; i++){
            int col = array[i].length;
            for(int j = 0; j < col; j++){
                System.out.print(array[i][j] +"  ");
            }
            System.out.println();
        }
    }
}