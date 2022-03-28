import java.util.Scanner;
class SortFactorCountMod{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nelem = sc.nextInt();
        int[] array = new int[nelem];
        getArray(array);
        int[] factorCount = new int[nelem];

        for(int index = 0; index <= nelem - 1; index++){
            factorCount[index] = getFactorCount(array[index]);
        }

        sort(array, factorCount);

        printArray(array);

        sc.close();
    }

    public static void sort(int[] array, int[] factorCount){
        for(int index = 0; index <= array.length - 1; index++){
            for(int jndex = index + 1; jndex <= array.length - 1; jndex++){
                if(factorCount[index] > factorCount[jndex]){
                    swap(array, index, jndex);
                    swap(factorCount, index, jndex);
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

    public static void getArray(int[] array){
        Scanner sc1 = new Scanner(System.in);
        for(int index = 0; index <= array.length - 1; index++){
            array[index] = sc1.nextInt();
        }
        sc1.close();
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