import java.util.Scanner;
 
class Program11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        getWord(number);
        sc.close();
    }

    public static void getWord(int number){
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] word = {"one", "ten", "hundred", "thousand", "ten thousand"};
        String result = "";
        for(int i = 0; number!= 0; i++){
            if(number % 10 == 0){
                number /= 10;
                continue;
            }
            if(i == 0){
                result = "and" + " " + numbers[number % 10] + " " + word[i] + (number % 10 > 1 ? "s " : " ");
            }
            else{
                result = numbers[number % 10] + " " + word[i] + (number % 10 > 1 ? "s " : " ") + result;
            }
            number /= 10;
        }
        System.out.print(result);
    }
}