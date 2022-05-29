import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;
 
class DFS{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[][] array = getArray();

        printArray(array);

        dfs(array);
    }

    public static void dfs(int[][] array){
        int[] visited = new int[array.length];
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;

        stack.push(i);
        visited[i] = 1;

        while(!stack.isEmpty()){
            int node = stack.pop();
            System.out.println("Visited node : " + node);

            for(int j = 0; j < array.length; j++){
                if(array[i][j] == 1 && visited[j] == 0){
                    stack.push(j);
                    visited[j] = 1;
                }
            }
            i++;
        }
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


/* 


Enter the row size : 5
Enter the adjacency matrix : 
0 1 1 1 0
1 0 0 1 1
1 0 0 1 0
1 1 1 0 1
0 1 0 1 0
Adjacency matrix : 
0 1 1 1 0
1 0 0 1 1
1 0 0 1 0
1 1 1 0 1 
0 1 0 1 0


Visited node : 0
Visited node : 3
Visited node : 4
Visited node : 2
Visited node : 1

*/