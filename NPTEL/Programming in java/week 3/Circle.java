import java.lang.*;
class Circle{
    static double x,y,r;
    Circle(double r){
        Circle.r = r;                                                                        //this.r = r;  - static variable handle statically
        Circle.x = 0;
        Circle.y = 0;
    }

    public static class Point{
        double x,y;
        Point(double a, double b){
            x = a;
            y = b;
        }
        void display(){
            System.out.println("(x,y): {" + x + ", " + y + "}.");
        }
    } 

    public boolean isInside(Point p){
        double px = p.x - x;
        double py = p.y - y;
        double distance = Math.sqrt((px*px)+(py*py));
        if(distance > r){
            return false;
        }
        else{
            return true;
        }
    }

        public static void main(String args[]){
            Circle a = new Circle(2.0);
            Point p1 = new Point(1.0, 2.0);
            System.out.println(a.isInside(p1));
            Circle b = new Circle(7.0);
            Point p2 = new Point(1.0, 3.0);
            System.out.println(b.isInside(p2));
        }
    }