import java.util.Scanner;

/**
 
    A little price to pay for a little gain. - > left shift all elements in the queue to reuse the memory space
    But still the queue is not shrinkable or expandable.  -> LinkedList

*/

class Queue{
    public int size;
    public int front;
    public int rear;
    public int[] queue;

    public Queue(int size){
        this.size = size;
        this.front = -1;
        this.rear = -1;
        this.queue = new int[size];
    }
}
 
class QueueLeftShift{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the size of the queue: ");
        int size = sc.nextInt();

        Queue queue = new Queue(size);

        while(true){
            System.out.println("\n1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    enqueue(queue);
                    break;
                case 2:
                    dequeue(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void enqueue(Queue queue){
        if(queue.rear == queue.size - 1){
            System.out.println("Queue is full\n");
            return;
        }

        if(queue.front == -1){
            queue.front = 0;
        }

        queue.rear++;
        System.out.print("Enter the element to be enqueued: ");
        queue.queue[queue.rear] = sc.nextInt();
    }

    public static void dequeue(Queue queue){
        if(queue.front == -1){
            System.out.println("Queue is empty\n");
            return;
        }

        System.out.println("The dequeued element is: " + queue.queue[queue.front]);
        leftShift(queue);
        queue.rear--;
    }

    public static void display(Queue queue){
        if(queue.front == -1){
            System.out.println("Queue is empty\n");
            return;
        }

        System.out.print("The queue is: ");
        for(int i = queue.front; i <= queue.rear; i++){
            System.out.print(queue.queue[i] + " ");
        }
        System.out.println("\n");
    }

    public static void leftShift(Queue queue){
        int temp = queue.queue[queue.rear];
        for(int i = queue.rear; i >  0; i--){
            int temp1 = queue.queue[i - 1];
            queue.queue[i - 1] = temp1;
            temp = temp1;
        }
    }


}