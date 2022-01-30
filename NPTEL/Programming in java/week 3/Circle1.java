class Circle1{
    static double x,y,r;
    Circle1(double r){
        Circle1.r = r;       //static type so access in static way -> using class itself.
    }
    public static class Point{
        double x,y;
        Point(double a, double b){
            this.x = a;
            this.y = b;
        }
        void display(){
            System.out.println("(x,y): { "+this.x+", "+this.y+")");
        }
    }

    public boolean isInside(Point p){
        double dx = p.x - x;
        double dy = p.y - y;
        double distance = Math.sqrt((dx * dx) + (dy * dy));
        if(distance < r)
            return true;
        else
            return false;    //if distance less than radius -> that point is inside circle
    }

    public static void main(String args[]){
        Circle1 a = new Circle1(10.0);
        Point pa = new Point(1.0, 2.0); //both Point are inside Circle1 - so accessible
        pa.display();
        System.out.println(a.isInside(pa));
        Circle1 b =new Circle1(1.0);
        Point pb = new Point(3.0, 3.0);
        System.out.println(b.isInside(pb));
    }
}
