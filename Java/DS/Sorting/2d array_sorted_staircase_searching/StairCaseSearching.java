import java.util.Scanner;
 
class StairCaseSearching{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[][] array = {{10, 20, 30, 40},
                         {15, 25, 35, 45},
                         {27, 29, 37, 48},
                         {32, 33, 39, 50}};

        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

        int row = 0, col = array[0].length - 1;

        while(row < array.length && col >= 0){
            if(array[row][col] == key){
                System.out.print("Found at row " + (row + 1) + " and column " + (col + 1));
                return;
            }
            else if(array[row][col] > key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Not found");
    }
}