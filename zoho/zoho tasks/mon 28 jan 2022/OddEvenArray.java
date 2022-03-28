import java.util.Scanner;
class OddEvenArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nelem = sc.nextInt();
        int[] array = new int[nelem];
        getArray(array);

        int nodd = getOdd(array, nelem);
        int neven = nelem - nodd;
        int[] oddArray = new int[nodd];
        int[] evenArray = new int[neven];

        getArray(array, oddArray, evenArray, nelem);
        printArray(oddArray, nodd);
        printArray(evenArray, neven);

        sc.close();
    }

    public static void getArray(int[] array){
        Scanner sc1 = new Scanner(System.in);
        for(int index = 0; index <= array.length - 1; index++){
            array[index] = sc1.nextInt();
        }
        sc1.close();
    }

    public static void printArray(int[] array, int nelem){
        System.out.println();
        for(int index = 0; index <= nelem - 1; index++){
            System.out.print(array[index] + " ");
        }
    }

    public static void getArray(int[] array, int[] oddArray, int[] evenArray, int nelem){
        int odd = 0, even = 0;
        for(int index = 0; index <= nelem - 1; index++){
            if(array[index] % 2 == 1){
                oddArray[odd++] = array[index];
            }
            else{
                evenArray[even++] = array[index];
            }
        }
    }

    public static int getOdd(int[] array, int nelem){
        int count = 0;
        for(int index = 0; index <= nelem - 1; index++){
            if(array[index] % 2 == 1){
                count++;
            }
        }
        return count;
    }
}

/*

10
1 2 3 4 5 6 7 8 9 10

1 3 5 7 9
2 4 6 8 10

*/