class Circle{
    double x;
    double y;
    double r;

    // constructors

    Circle(double x, double y, double r)
    {
        this.x=x;
        this.y=y;
        this.r=r;
    }

    Circle(double r)
    {
        this(0.0,0.0,r);      //take center as (0,0)
    }

    Circle()
    {
        this(0.0,0.0,1.0);
    }

    Circle(Circle c)
    {
        this(c.x,c.y,c.r);
    }

    double perimeter()
    {
        double peri = (2*(22/7)*r);
        return peri;
    }

    double area()
    {
        double are = (22/7)*r*r;
        return are;
    }

    void both()
    {
        double area = this.area();
        double peri = this.perimeter();
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + peri);
    }
}