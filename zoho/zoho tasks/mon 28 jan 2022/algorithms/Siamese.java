import java.util.Scanner;
class Siamese{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();

        int[][] array = new int[rows][rows];
        initialize(array, rows);

        int count = 1;
        int x = 0, y = (rows - 1) / 2; 
        array[x][y] = count++;
        for(; count != (rows * rows) + 1;){
            x = (x - 1) < 0 ? rows - 1 : x- 1;
            y = (y + 1) % rows;

            if(array[x][y] == 0){
                array[x][y] = count++;
            }
            else{
                x = (x + 2) % rows;
                y = (y - 1) < 0 ? rows - 1 : y - 1;
                array[x][y] = count++;
            }
            printArray(array, rows);
            
        }

        printArray(array, rows);


    }

    public static void initialize(int[][] array, int rows){
        for(int row = 0; row <= rows - 1; row++){
            for(int col = 0; col <= rows - 1; col++){
                array[row][col] = 0;
            }
        }
    }

    public static void printArray(int[][] array, int rows){
        System.out.println();
        for(int i = 0; i <= rows - 1; i++){
            for(int j = 0; j <= rows - 1; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}