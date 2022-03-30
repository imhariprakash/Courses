import java.util.Scanner;
 
class Program1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        int[] array = getCount(number);
        number = array[0];
        int count = array[1];
        getWord(number, count);
        sc.close();
    }

    public static void getWord(int number, int count){
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] word = {"ten thousand", "thousand", "hundred", "ten", " "};
        for(int i = 0; i < count; i++){
            if(number % 10 == 0){
                continue;
            }
            if(i == count - 1){
                System.out.print("and" + " " + numbers[number % 10] + " ");
            }
            else{
                System.out.print(numbers[number % 10] + " " + word[5 - count + i]);
                System.out.print(number % 10 > 1 ? "s " : " ");
            }
            number /= 10;
        }
    }




    public static int[] getCount(int number){
        int[] array = {0,0};
        while(number != 0){
            array[0] = array[0] * 10 + number % 10;
            number = number / 10;
            array[1]++;
        }
        return(array);
    }
}