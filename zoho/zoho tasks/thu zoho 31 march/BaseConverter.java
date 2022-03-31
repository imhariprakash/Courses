import java.util.*;
class BaseConverter{
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
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(number != 0){
            list.add(number % base);
            number /= base;
        }
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) > 9 ? (char)(list.get(i) + 'a' - 10) : (char)(list.get(i) + '0'));
        }
    }
}