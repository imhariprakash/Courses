import java.util.Scanner;

class AverageArray{
    public static float Average(int[] array){
        int n = array.length;
        float average = 0;
        for(int i=0; i < n; i++){
            average += array[i];
        }
        return(average / n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            array[i] = sc.nextInt();
        }
        float average = Average(array);
        System.out.print("Average is : "+average+".");
        sc.close();
    }
}