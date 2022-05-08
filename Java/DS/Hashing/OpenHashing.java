import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node prev;
}
 
class OpenHashing{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter size : ");
        int size = sc.nextInt();

        Node[][] hashtable = new Node[size][3]; // to make insertion faster we can use 2D array - having linked list head and tail.

        while(true){
            System.out.print("1. Insert 2. Search 3. Delete 4. print 5. Exit");
            System.out.print("\nEnter choice : ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    insert(hashtable);
                    break;
                case 2:
                    search(hashtable);
                    break;
                case 3:
                    delete(hashtable);
                    break;
                case 4:
                    print(hashtable);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void insert(Node[][] hashtable){
        System.out.print("Enter data : ");
        int data = sc.nextInt();

        int index = data % hashtable.length;

        Node node = new Node();
        node.data = data;

        if(hashtable[index][0] == null){
            hashtable[index][0] = node;
            hashtable[index][1] = node; // head
            hashtable[index][2] = node; // tail
        }
        else{
            hashtable[index][2].next = node;
            node.prev = hashtable[index][2];
            hashtable[index][2] = node; 
        }
    }

    public static void print(Node[][] hashtable){
        for(int i = 0; i < hashtable.length; i++){
            Node temp = hashtable[i][0];
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void search(Node[][] hashtable){
        System.out.print("Enter data to search : ");
        int data = sc.nextInt();

        int index = data % hashtable.length;

        Node temp = hashtable[index][0];

        while(temp != null){
            if(temp.data == data){
                System.out.println("Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not found");
    }

    public static void delete(Node[][] hashtable){
        System.out.print("Enter data to delete : ");
        int data = sc.nextInt();

        int index = data % hashtable.length;

        Node temp = hashtable[index][0];

        while(temp != null){
            if(temp.data == data){
                if(hashtable[index][1] == hashtable[index][2]){
                    hashtable[index][0] = null;
                    hashtable[index][1] = null;
                    hashtable[index][2] = null;
                    return;
                }
                else if(temp == hashtable[index][1]){
                    hashtable[index][1] = temp.next;
                    hashtable[index][0] = temp.next;
                    temp.next.prev = null;
                    return;
                }
                else if(temp == hashtable[index][2]){
                    hashtable[index][2] = temp.prev;
                    hashtable[index][2].next = null;
                    return;
                }
                else{
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    return;
                }
            }
            temp = temp.next;
        }
        System.out.println("Not found");
    }
}