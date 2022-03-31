import java.util.*;
class BaseConverter1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        getNumberSystem(number, base);
        sc.close();

    }

    public static void getNumberSystem(int number, int base){
        String str = "";
        while(number != 0){
            int temp = (number % base);
            str = (temp > 9 ? (char)(temp - 10 + 'a') : (char)(temp + '0')) + str;
            number /= base;
        }
        System.out.println(str);
    }
}