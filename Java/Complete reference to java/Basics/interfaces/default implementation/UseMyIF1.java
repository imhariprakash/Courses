import java.util.Scanner;
 
class UseMyIF1{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int defNum = MyIF1.getDefaultNumber();
        System.out.println("Default number is: " + defNum);

        // TestMyIF1 myIF1 = new TestMyIF1();
        // System.out.println(myIF1.getDefaultNumber());          // static methods cant be ovverridden

    }
}
