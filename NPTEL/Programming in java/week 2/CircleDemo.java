class CircleDemo{
    public static void main(String args[]){
        Circle c = new Circle(0.0,0.0,5);
        double peri = c.perimeter();
        double area = c.area();
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + peri);
        System.out.println();
        c.both();
    }
}