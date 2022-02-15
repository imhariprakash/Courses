class LifeTime {
    public static void main(String[] args) {
        int x;
        for(x = 0; x < 3; x++) {
            if(x==0){
                int y = -1; // y is initialized each time block is entered
            }
            System.out.println("y is: " + y); // this always prints -1
            //y = 100;
            y++;    //error -> when 1 iteration over y is destoryed - so from next iteration its not there
            System.out.println("y is now: " + y);
        }
    }
}