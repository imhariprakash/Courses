import java.util.Scanner;

/*
    This method is inefficient because it uses a lot of memory.
    Say initially we create a queue of size n.
    Then we enqueue it with n - 1 elements.
    Then we dequeue it with n - 1 elements.

    If its a good one after dequeueing, we should be able to enqueue n new elements - in this case we are just making front incrementing by 1. - not clearing or shifting the queue.
    So we are able to add only one new element to the queue even though we are dequeueing n - 1 elements.

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
 
class QueueMemoryWastage{
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
        queue.front++;
        queue.size--;
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


}

/*


Enter the size of the queue: 2

1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice: 1
Enter the element to be enqueued: 1

1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice: 1
Enter the element to be enqueued: 2

1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice: 3
The queue is: 1 2 


1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice: 2
The dequeued element is: 1

1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice: 2
The dequeued element is: 2

1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice: 3
The queue is: 


1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice: 1
Queue is full


1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice:



*/