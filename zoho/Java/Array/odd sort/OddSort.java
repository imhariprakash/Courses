/*

2. Write a program to sort the elements in odd positions in descending order and elements in ascending order

Eg 1: Input: 13,2 4,15,12,10,5
        Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
        Output: 9,2,7,4,5,6,3,8,1 

*/

import java.util.Scanner;
class OddSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] size = {0,1};
        getSize(str,size);
        int[] array = new int[size[1]];
        extractArray(str, array, size[0]);
        sort(array, size[1]);
        sort1(array, size[1]);
        printArray(array, size[1]);
    }

    public static void sort(int[] array, int n){
        for(int i = 0 ; i < n - 2; i = i + 2){
            for(int j = i + 2; j < n; j = j + 2){
                if(array[i] < array[j]){
                    swap(array, i, j);
                }
            }
        }
    }

    public static void sort1(int[] array, int n){
        for(int i = 1 ; i < n - 1; i = i + 2){
            for(int j = i + 2; j < n; j = j + 2){
                if(array[i] > array[j]){
                    swap(array, i, j);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array, int n){
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void extractArray(String str, int[] array, int n){
        int start = 0, end, j = 0, i;
        for(i = 0; i < n; i++){
            if(str.charAt(i) == ',' || str.charAt(i) == ' '){
                array[j++] = getNumber(str, start, i - 1);
                start = i + 1;
            }
        }
        array[j] = getNumber(str, start, i - 1);
    }

    public static int getNumber(String str, int start, int end){
        int num = 0;
        for(int i = start; i <= end; i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                num = num * 10 + (int)(str.charAt(i) - 48);
            }
        }
        return num;
    }

    public static void getSize(String str, int[] size){
        try{
            while(true){
                if(str.charAt(size[0]) == ',' || str.charAt(size[0]) == ' '){ 
                    size[1]++;
                }
                str.charAt(size[0]++);
            }
        }catch(Exception e){
            return;
        }
    }
}