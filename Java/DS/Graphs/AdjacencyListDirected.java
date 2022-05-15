import java.util.Scanner;

class Node{
    int data;
    Node next;
}
 
class AdjacencyListDirected{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int vertices = 5;
        Node[] adjList = new Node[vertices];

        initAdjacencyList(adjList);

        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 0, 3);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 1, 4);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 3, 4);

        System.out.println(hasEdge(adjList, 3, 1));
        System.out.println(hasEdge(adjList, 0, 1));  // problem : not error handled - if input outof index - it will crash

        printAdjacencyList(adjList);

    }

    public static void initAdjacencyList(Node[] adjList) { 
        for(int i = 0; i < adjList.length; i++) {
            adjList[i] = null;
        }
    }

    public static void addEdgeWithTraversal(Node[] adjList, int src, int dest) {
        Node newNode = new Node();
        newNode.data = dest;
        newNode.next = null;
        
        if(adjList[src] == null){
            adjList[src] = newNode;
        } 
        else {
            Node temp = adjList[src];
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void addEdgeWithOutTraversal(Node[] adjList, int src, int dest) {
        Node newNode = new Node();
        newNode.data = dest;
        newNode.next = null;
        
        if(adjList[src] == null){
            adjList[src] = newNode;
        } 
        else {
            newNode.next = adjList[src];
            adjList[src] = newNode;
        }
    }

    public static void addEdge(Node[] adjList, int src, int dest) {
        addEdgeWithOutTraversal(adjList, src, dest);
    }

    public static boolean hasEdge(Node[] adjList, int src, int dest) {
        if(adjList[src] == null) {
            return false;
        }
        Node temp = adjList[src];
        while(temp != null) {
            if(temp.data == dest) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void printAdjacencyList(Node[] adjList) {
        for(int i = 0; i < adjList.length; i++) {
            Node temp = adjList[i];
            System.out.print(i + " -> ");
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}