import java.util.Scanner;

abstract class Figure{
    double dim1;
    double dim2;

    public Figure(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract double area();
}

class Rectangle extends Figure{
    public Rectangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    public double area(){
        return dim1 * dim2;
    }
}

class Triangle extends Figure{
    public Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    public double area(){
        return dim1 * dim2 / 2;
    }
}


 
class AbstractAreas{
    public static void main(String[] args){
        //Figure f = new Figure(10, 20);  -- not legal - cannot be instantiated
        Figure f = new Rectangle(10, 20);
        System.out.println(f.area());
        Rectangle r = new Rectangle(10, 10);
        System.out.println(r.area());
        Triangle t = new Triangle(10, 5);
        System.out.println(t.area());
        f = t;
        System.out.println(f.area());
    }
}