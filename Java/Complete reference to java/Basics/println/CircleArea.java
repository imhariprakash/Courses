import java.util.*;
class CircleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        long rad = sc.nextLong();
        System.out.println("The area of the circle is: "+rad*3.1416*rad);
        sc.close();
    }
}