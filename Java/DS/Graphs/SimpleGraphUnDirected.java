import java.util.Scanner;
 
class SimpleGraphUnDirected{ // directed graph
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        //System.out.print("Enter the number of vertices : ");
        int vertices = 5;

        int[][] graph = new int[vertices][vertices];

        initGraph(graph);

        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 0, 3);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        printGraph(graph);
    }

    public static void addEdge(int[][] graph, int i, int j){
        graph[i][j] = 1; 
        graph[j][i] = 1;
    }

    public static int getEdge(int[][] graph, int i, int j){
        return graph[i][j];
    }

    public static boolean hasEdge(int[][] graph, int i, int j){
        return graph[i][j] == 1;
    }

    public static void removeEdge(int[][] graph, int i, int j){
        graph[i][j] = 0;
        graph[j][i] = 0;
    }

    public static void initGraph(int[][] graph){
        for(int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph.length; j++){
                graph[i][j] = 0;
            }
        }
    }

    public static void printGraph(int[][] graph){
        for(int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph.length; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}