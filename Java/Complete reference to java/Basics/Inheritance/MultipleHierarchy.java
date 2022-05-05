class Box{
    private double width;
    private double height;
    private double depth;

    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double length){
        width = length;
        height = length;
        depth = length;
    }

    double volume(){
        return width * height * depth;
    }
}


class BoxWeight extends Box{
    private double weight;

    BoxWeight(){
        super();
        weight = -1;
    }

    BoxWeight(double length){
        super(length);
        weight = length;
    }

    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double length, double weight){
        super(length);
        this.weight = weight;
    }

    BoxWeight(double length, double height, double depth, double weight){
        super(length, height, depth);
        this.weight = weight;
    }

    double volume(){
        return super.volume() * weight;
    }
}


class Shipment extends BoxWeight{
    double cost;

    Shipment(){
        super();
        cost = -1;
    }

    Shipment(double length){
        super(length);
        cost = length;
    }

    Shipment(BoxWeight ob){
        super(ob);
        cost = ob.cost;
    }

    Shipment(double length, double weight){
        super(length, weight);
        cost = length;
    }

    Shipment(double length, double height, double depth, double weight){
        super(length, height, depth, weight);
        cost = length;
    }

    Shipment(double length, double height, double depth, double weight, double cost){
        super(length, height, depth, weight);
        this.cost = cost;
    }

    double volume(){
        return super.volume() * cost;
    }

    double cost(){
        return volume() * 0.1;
    }

    void print(){
        System.out.println("Volume: " + volume());
        System.out.println("Cost: " + cost());
    }
}

class MultipleHierarchy{
    public static void main(String[] args){
        Shipment s1 = new Shipment(10, 10, 10, 10, 10);
        s1.print();
    }
}