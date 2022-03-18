class LinkedList <T>{
    public T data;
    public LinkedList <T> next;
}


class GenericList{
    public  static void main(String[] args){
        LinkedList <Integer> head = new LinkedList <Integer> ();
        LinkedList <Integer> middle = new LinkedList <Integer> ();
        LinkedList <Integer> tail = new LinkedList <Integer> ();

        head.data = 10;
        middle.data = 20;
        tail.data = 30;
        head.next = middle;
        middle.next = tail;
        tail.next = null;

        LinkedList <Integer> temp = new LinkedList <Integer> ();
        temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}