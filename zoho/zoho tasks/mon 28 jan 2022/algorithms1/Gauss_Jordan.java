import java.util.Scanner;
 
class Gauss_Jordan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int rows = 3, columns = 4;
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();
        float[][] array = new float[rows][columns];
        getMatrix(array, rows, columns);
        //float[][] array = {{10,3,1,19},{3,10,2,29},{1,2,10,35}};
        
        gauss(array, rows, columns);

        printMatrix(array, rows, columns);

        sc.close();

    }

    public static void gauss(float[][] array, int rows, int columns){
        for(int diag = 0; diag <= rows - 1; diag++){
            pivot(array, rows, columns, diag);
            printMatrix(array, rows, columns);
            nonPivot(array, rows, columns, diag);
        }
    }

    public static void pivot(float[][] array, int rows, int columns, int diag){
        float temp = array[diag][diag];
        if(temp == 0){
            int i = 1;
            if(diag + i == rows){
                return;
            }
            while(array[diag + i][diag] == 0){
                i++;
                if(i == rows){
                    return;
                }
            }
            for(int col = 0; col <= columns - 1; col++){
                float swap = array[diag][col];
                array[diag][col] = array[diag + i] [col];
                array[diag + i][col] = swap;
            }
        }
        temp = array[diag][diag];
        for(int col = 0; col <= columns - 1; col++){
            array[diag][col] = array[diag][col] / temp;
        }
    }

    public static void nonPivot(float[][] array, int rows, int columns, int diag){
        for(int row = 0; row <= rows - 1; row++){
            if(row == diag){
                continue;
            }
            float temp = array[row][diag];
            for(int col = 0; col <= columns - 1; col++){
                array[row][col] = array[row][col] - temp * array[diag][col];
            }
            printMatrix(array, rows, columns);
        }
    }

    public static void getMatrix(float[][] array, int rows, int columns){
        Scanner sc1 = new Scanner(System.in);
        for(int row = 0; row <= rows - 1; row++){
            for(int column = 0; column <= columns - 1; column++){
                System.out.print("Enter the value of [" + (row + 1) + "][" + (column + 1) + "] : ");
                array[row][column] = sc1.nextFloat();
            }
        }
        sc1.close();
    }

    public static void printMatrix(float[][] array, int rows, int columns){
        System.out.println();
        for(int row = 0; row <= rows - 1; row++){
            for(int column = 0; column <= columns - 1; column++){
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }
}