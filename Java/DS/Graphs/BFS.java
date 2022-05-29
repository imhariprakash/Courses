import java.util.Scanner;
import java.util.Queue;
 
class BFS{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[][] array = getArray();

        printArray(array);

        bfs(array);
    }

    public static void bfs(int[][] array){
        int[] visited = new int[array.length];
        Queue<Integer> queue = new java.util.LinkedList<Integer>();
        int i = 0;

        queue.add(i);
        visited[i] = 1;

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.println("Visited node : " + node);

            for(int j = 0; j < array.length; j++){
                if(array[i][j] == 1 && visited[j] == 0){
                    queue.add(j);
                    visited[j] = 1;
                }
            }
            i++;
        }
    }

    public static int[][] getArray(){
        System.out.print("Enter the row size : ");
        int row = sc.nextInt();

        int[][] array = new int[row][row];

        System.out.println("Enter the adjacency matrix : ");

        for(int i = 0; i < row; i++){
            for(int j = 0; j < row; j++){
                array[i][j] = sc.nextInt();
            } 
        }

        return array;
    }

    public static void printArray(int[][] array){
        System.out.println("Adjacency matrix : ");

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
    }
}