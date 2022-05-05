class Box{
    double depth;
    double height;
    double width;

    Box(){
        depth = 0;
        height = 0;
        width = 0;
    }

    Box(Box obj){
        depth = obj.depth;
        height = obj.height;
        width = obj.width;
    }

    Box(double depth, double height, double width){
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    Box(double len){
        depth = len;
        height = len;
        width = len;
    }

    double volume(){
        return(depth * height * width);
    }
}

class BoxWeight extends Box{
    double mass;

    BoxWeight(){
        super();
        mass = 0;
    }

    BoxWeight(BoxWeight obj){
        super(obj);
        mass = obj.mass;
    }

    BoxWeight(double depth, double height, double width, double mass){
        super(depth, height, width);
        this.mass = mass;
    }

    BoxWeight(double len, double mass){
        super(len);
        this.mass = mass;
    }

    double density(){
        return(mass / volume());
    }
}

class DemoSuperKeyword{
    public static void main(String[] args){
        BoxWeight obj1 = new BoxWeight();
        BoxWeight obj2 = new BoxWeight(10, 10);
        BoxWeight obj3 = new BoxWeight(10, 10, 10, 10);
        BoxWeight obj4 = new BoxWeight(obj3);

        System.out.println(obj1.mass + " " + obj1.density());
        System.out.println(obj2.mass + " " + obj2.density());
        System.out.println(obj3.mass + " " + obj3.density());
        System.out.println(obj4.mass + " " + obj4.density());
        System.out.println(0.0 / 0.0); //NaN
    }
}