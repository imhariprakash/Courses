import java.util.Scanner;
 
class HashingLinearProbing{
    public static Scanner sc = new Scanner(System.in);
    public static int size = 0;
    public static int capacity = 0;

    public static void main(String[] args){

        System.out.print("Enter the number of elements in the hash table: ");
        capacity = sc.nextInt();
        int[] hashtable = new int[capacity];
        initialize(hashtable);

        while(true){
            System.out.print("1. Insert 2. Delete 3. Retrieve 4. Print 5. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    insert(hashtable);
                    break;
                case 2:
                    delete(hashtable);
                    break;
                case 3:
                    retrieve(hashtable);
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

    public static void initialize(int[] hashtable){
        for(int i = 0; i < hashtable.length; i++){
            hashtable[i] = -1;
        }
    }

    public static void insert(int[] hashtable){
        System.out.print("Enter the element to be inserted: ");
        int element = sc.nextInt();

        int index = element % capacity;

        do{
            if(hashtable[index] == -1){
                hashtable[index] = element;
                size++;
                return;
            }
            index = (index + 1) % capacity;
        }while(index != element % capacity);

        System.out.println("Hash table is full");
    }

    public static void delete(int[] hashtable){
        System.out.print("Enter the element to be deleted: ");
        int element = sc.nextInt();

        int index = element % capacity;

        do{
            if(hashtable[index] == element){
                hashtable[index] = -1;
                size--;
            }
            index = (index + 1) % capacity;
        }while(index != element % capacity);

        System.out.println("Element not found");
    }

    public static void retrieve(int[] hashtable){
        System.out.print("Enter the element to be retrieved: ");
        int element = sc.nextInt();

        int index = element % capacity;

        do{
            if(hashtable[index] == element){
                System.out.println("Element found at index " + index);
                return;
            }
            index = (index + 1) % capacity;
        }while(index != element % capacity);

        System.out.println("Element not found");

    }

    public static void print(int[] hashtable){
        for(int i = 0; i < capacity; i++){
            System.out.print(hashtable[i] + " ");
        }
        System.out.println();
    }
}