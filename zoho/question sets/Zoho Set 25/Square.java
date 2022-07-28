import java.util.Scanner;
public class Square{
     int x,y;
    public Square(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Square p1=new Square(20,10);
        Square p2=new Square(10,20);
        Square p3=new Square(20,20);
        Square p4=new Square(10,10);
        System.out.println(isSquare(p1,p2,p3,p4));
        System.out.println(isrect(p1,p2,p3,p4));
        sc.close();
    }
    static boolean isSquare(Square p1,Square p2,Square p3,Square p4)
    {
        int d2=dis(p1,p2);
        int d3=dis(p1,p3);
        int d4=dis(p1,p4);
        if(d2==0 ||d3==0 ||d4==0)
        return false;
        if(d2==d3 && d4==2*d2 && dis(p2,p3)==2*dis(p2,p4))
        return true;
        if(d2==d4 && d3==2*d2 && dis(p2,p4)==2*dis(p2,p3))
        return true;
        if(d3==d4 && d2==2*d3 && dis(p3,p4)==2*dis(p3,p2))
        return true;
        return false;
    }
    static int dis(Square p1,Square p2)
    {
        System.out.println((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
        return(p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y);
    }
    static boolean isrect(Square p1,Square p2,Square p3,Square p4)
    {
        if(dis(p1,p2)==dis(p3,p4) &&dis(p1,p3)==dis(p2,p4) && dis(p1,p3)!=dis(p1,p2) && dis(p1,p4)==dis(p2,p3))
        return true;
        if(dis(p1,p4)==dis(p2,p3) && dis(p1,p2)==dis(p3,p4) &&dis(p1,p4)!=dis(p1,p2) &&dis(p1,p3)==dis(p4,p2))
        return true;
        return false;
    }
}