import java.util.*;

class Point2D{
    int x;
    int y;
    Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    void display(){
        System.out.println("X: "+x+", Y: "+y+".");
    }
}

class Point3D extends Point2D{
    int z;
    Point3D(int x, int y, int z){
        super(x,y);
        super.x = 123;     //constructor name is same as class name without return type  //accessing method     super.method name, super.color
        this.z = z;
    }
    void display(){
        System.out.println("X: "+x+", Y: "+y+" z: "+z+".");
    }
}

public class Inheritance_constructor_using_super_keyword{
    public static void main(String[] args){
        Point2D p = new Point2D(1,2);
        Point3D p1 = new Point3D(3,4,5);
        p.display();
        p1.display();
    }
}