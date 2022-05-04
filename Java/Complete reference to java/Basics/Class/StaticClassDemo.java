import java.util.Scanner;

class StaticClass{
    public static String str = "hello universe";
    private static String str1 = "hello world";
    public int num = 10;

    public static void sum(int x, int y){
        System.out.println("Sum x + y : " + (x+y));
    }

    public static class MyNestedClass{
        static{
            System.out.println("Static block");
        }
        public void display(){
            System.out.println("Nested class");
            int x;
            int y;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter x : ");
            x = sc.nextInt();
            System.out.print("Enter y : ");
            y = sc.nextInt();
            sum(x,y);
            //System.out.println(num); - no static variable from outer class can't be accessed
        }
    }

    public static String getStr1(){
        return str1;
    }

    private static class InnerClass{
        public static void print(){
            System.out.println(str);
            System.out.println(str1);
        }
    }

    public static class InnerClass1{
        public void print(){
            System.out.println(str);
            System.out.println(str1);
        }
    }

    public static void accessInnerClass(){ // access private static class
        InnerClass.print();
    }
}
 
public class StaticClassDemo{
    public static void main(String[] args){
        System.out.println(StaticClass.str);
        System.out.println(StaticClass.getStr1());
        StaticClass.accessInnerClass();
        StaticClass.InnerClass1 innerClass1 = new StaticClass.InnerClass1();
        System.out.println();
        innerClass1.print();

        StaticClass.MyNestedClass myNestedClass = new StaticClass.MyNestedClass();
        myNestedClass.display();
    }
}