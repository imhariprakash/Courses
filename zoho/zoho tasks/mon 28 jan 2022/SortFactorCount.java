import java.util.Scanner;
class SortFactorCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        getArray(array);

        sort(array);

        printArray(array);

        sc.close();
    }

    public static void getArray(int[] array){
        Scanner sc1 = new Scanner(System.in);
        for(int index = 0; index <= array.length - 1; index++){
            array[index] = sc1.nextInt();
        }
        sc1.close();
    }

    public static void sort(int[] array){
        for(int index = 0; index <= array.length - 1; index++){
            for(int jndex = index + 1; jndex <= array.length - 1; jndex++){
                if(getFactorCount(array[index]) > getFactorCount(array[jndex])){
                    swap(array, index, jndex);
                }
            }
        }
    }

    public static int getFactorCount(int number){
        int count = 0;
        for(int index = 2; index <= number / 2; index++){
            if(number % index == 0){
                count++;
            }
        }
        return count;
    }

    public static void swap(int[] array, int index, int jindex){
        int temp = array[index];
        array[index] = array[jindex];
        array[jindex] = temp;
    }

    public static void printArray(int[] array){
        System.out.println();
        for(int index = 0; index <= array.length - 1; index++){
            System.out.print(array[index] + " ");
        }
    }
}

/*

5
8 15 25 36 42

25 15 8 42 36 

*/