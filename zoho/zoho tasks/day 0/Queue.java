class Queue{
    private int MAX = 100;
    private int start = 0;
    private int[] array = new int[MAX];
    private int count = 0;
                          
    public void push(int num){
        if(count == MAX){
            System.out.println("Queue is full");
            return;
        }
        else{
            array[this.count++] = num;
        }
    }
    public int pop(){
        if(count == start){
            System.out.println("Stack underflow.");
            return(-1);
        }
        else{
            return(array[start++]);
        }
    }
}

