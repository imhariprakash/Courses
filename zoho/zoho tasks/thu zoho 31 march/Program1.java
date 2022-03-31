import java.util.Scanner;
 
class Program1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        getWord(number);
        sc.close();
    }

    public static void getWord(int number){
        String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if(number / 1000 != 0){
            if(number / 1000 < 20){
                System.out.print(ones[number / 1000 - 1]);
            }
            else{
                System.out.print(tens[number / 10000 - 2]);
            }
            System.out.print(" thousand ");
            number %= 1000;
        }

        if(number / 100 != 0){
            System.out.print((number / 100 > 0 ? ones[number / 100 - 1] : "" )+ " hundred and ");
            number %= 100;
        }

        if(number >= 20){
            System.out.print(tens[number / 10 - 2] + " ");
            number %= 10;
        }
        System.out.print(number > 0 ? ones[number - 1] : " ");


        
    }

    public static int getCount(int num){
        int count = 0;
        while(num != 0){
            count++;
        }
        return count;
    }
}