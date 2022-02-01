import java.util.*;

class Point2D{
    int x;
    int y;
    void display(){
        System.out.println("X: "+x+", Y: "+y+".");
    }
}

class Point3D extends Point2D{
    int z;
    void display(){
        System.out.println("X: "+x+", Y: "+y+" z: "+z+".");
    }
}

public class Inheritance_sample{
    public static void main(String[] args){
        Point2D p = new Point2D();
        Point3D p1 = new Point3D();
        p.x=1;
        p.y=2;
        p.display();
        p1.x=10;
        p1.y=12;
        p1.z=123;
        p1.display();
    }
}