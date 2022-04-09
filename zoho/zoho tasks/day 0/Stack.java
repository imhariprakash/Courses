class Stack{
    private int MAX = 10;
    private int[] array = new int[MAX];
    private int count = 0;
                          
    public void push(int num){
        if(count == MAX){
            System.out.println("Stack overflow.");
        }
        else{
            array[this.count++] = num;
        }
    }
    public int pop(){
        if(count == 0){
            System.out.println("Stack underflow.");
            return(-1);
        }
        else{
            return(array[--count]);
        }
    }
}