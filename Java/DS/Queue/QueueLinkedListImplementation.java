import java.util.Scanner;

class QueueLinkedList {
    int data;
    QueueLinkedList next;
    public static QueueLinkedList head;
    public static QueueLinkedList tail;
    public static int size;
}
 
class QueueLinkedListImplementation {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        while(true){
            System.out.println("1. Enqueue 2. Dequeue 3. Display 4. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    enqueue();
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void enqueue(){
        System.out.print("Enter the data to be enqueued : ");
        QueueLinkedList newNode = new QueueLinkedList();
        newNode.data = sc.nextInt();        

        if(QueueLinkedList.head == null){
            QueueLinkedList.head = newNode;
            QueueLinkedList.tail = newNode;
            QueueLinkedList.size++;
        }
        else{
            QueueLinkedList.tail.next = newNode;
            QueueLinkedList.tail = newNode;
            QueueLinkedList.size++;
        }
    }

    public static void dequeue(){
        if(QueueLinkedList.head == null){
            QueueLinkedList.tail = null;
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Dequeued element is " + QueueLinkedList.head.data);
        QueueLinkedList.head = QueueLinkedList.head.next;
        QueueLinkedList.size--;
    }

    public static void display(){
        if(QueueLinkedList.head == null){
            System.out.println("Queue is empty");
            return;
        }

        QueueLinkedList temp = QueueLinkedList.head;
        while(temp != null){
        System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("\n");
    }


}