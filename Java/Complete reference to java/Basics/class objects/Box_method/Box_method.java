class Box_method{
    double breadth;
    double depth;
    double height;

    public Box_method(double breadth, double depth, double height){
        this.depth = depth;
        this.height = height;
        this.breadth = breadth;
    }

    public void printVolume(){
        System.out.println("Volume: "+ height * depth * breadth + " .");
    }
}