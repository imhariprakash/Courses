import java.util.Scanner;
import java.lang.Math;
 
class Program2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        getNumber(number);
        sc.close();
    }

    public static void getNumber(int number){
        int[] array = {0,0,0,0,0,0,0,0,0};
        for(int i = 0; i < number % 10; i++){
            array[i] = 1;
        }
        number = number / 10;
        int count = 1;
        while(number > 0){
            for(int i = 0; i < number % 10; i++){
                array[i] = (int)Math.pow(10, count) + array[i];
            }
            number /= 10;
            count++;
        }

        count = 1;

        int i;

        for(i = 0; array[i] != 0 && i < array.length - 1; i++){
            if(array[i] == array[i + 1]){
                count++;
            }
            else{
                System.out.print(count + " * " + array[i] + " = " + (count * array[i])  + "\n");
                count = 1;
            }
        }
        if(array[i] != 0){
            System.out.print(count + " * " + array[i] + " = " + (count * array[i])  + "\n");
        }
    }

    
}



/*
    623 

    3
    1 1 1 0 0 0 0 0 0

    2
    11 11 01 00 00 00 00 00 00

    6
    111 111 101 100 100 100 000 000 000

    2 * 111 = 222
    1 * 101 = 101
    3 * 100 = 300
             _______
              623
             _______


*/