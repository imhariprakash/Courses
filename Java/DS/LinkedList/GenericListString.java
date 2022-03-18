class GenericListString{
    public  static void main(String[] args){
        LinkedList <String> head = new LinkedList <String> ();
        LinkedList <String> middle = new LinkedList <String> ();
        LinkedList <String> tail = new LinkedList <String> ();

        head.data = "Hello";
        middle.data = "Hi";
        tail.data = "Hello";
        head.next = middle;
        middle.next = tail;
        tail.next = null;

        LinkedList <String> temp = new LinkedList <String> ();
        temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}