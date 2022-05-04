interface Score {
    int run = 321;
    void getScore();                           // using interfaces
}
public class AnonymousClassExample {
    public static void main(String[] args) {
        // Myclass is hidden inner class of Score interface   
        // whose name is not written but an object to it    
        // is created.   
        Score s = new Score() {
            @Override
            public void getScore() {
                //prints score                                    // define method while creating instances
                System.out.print("Score is " + run);
            }
        };
        s.getScore();
    }
}