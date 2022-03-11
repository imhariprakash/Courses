import java.util.Scanner;
class UseBox{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        System.out.print("Enter the length: ");
        myBox1.length = sc.nextDouble();
        System.out.print("Enter the breadth: ");
        myBox1.breadth = sc.nextDouble();
        System.out.print("Enter tge height: ");
        myBox1.height = sc.nextDouble();

        System.out.print("Enter the length: ");
        myBox2.length = sc.nextDouble();
        System.out.print("Enter the breadth: ");
        myBox2.breadth = sc.nextDouble();
        System.out.print("Enter tge height: ");
        myBox2.height = sc.nextDouble();

        System.out.println("The volume is : " + myBox1.volume());
        System.out.print("The volume is : " + myBox2.volume());
    }
}