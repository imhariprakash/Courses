import java.util.Scanner;

class LinkedListDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList head = new LinkedList();
        LinkedList middle = new LinkedList();
        LinkedList last = new LinkedList();
        head.data = 10;
        middle.data = 20;
        last.data = 30;
        head.next = middle;
        middle.next = last;
        last.next = null;
        
        LinkedList temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

        sc.close();
    }
}