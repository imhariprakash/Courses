import java.util.Scanner;

public class Node{
    int data;
    Node next;
    Node prev;

    public static Scanner sc;

    static{
        sc = new Scanner(System.in);
    }

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    public Node(int data, Node next, Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public static Node get_linked_list(){
        System.out.print("Enter the number of nodes in the linked list : ");
        int n = Node.sc.nextInt();
        Node head = null;
        Node tail = null;
        System.out.println("Enter the elements of the linked list : \n");
        for(int i = 0; i < n; i++){
            int data = Node.sc.nextInt();
            Node new_node = new Node(data);
            if(head == null){
                head = new_node;
                tail = new_node;
            }
            else{
                tail.next = new_node;
                new_node.prev = tail;
                tail = new_node;
            }
        }
        return head;
    }

    public static void printLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}