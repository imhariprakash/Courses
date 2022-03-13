import java.util.Scanner;
class MergeSortedArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int[] size1 = {0, 1};
        int[] size2 = {0, 1};
        getSize(str1, size1);
        getSize(str2, size2);

        int[] array1 = new int[size1[1]];
        int[] array2 = new int[size2[1]];

        extractArray(str1, size1[0], array1);
        extractArray(str2, size2[0], array2);

        size1[1] = removeDuplicates(array1, size1[1]);
        size2[1] = removeDuplicates(array2, size2[1]);

        int[] merge = new int[size1[1] + size2[1]];

        int l = mergeArray(array1, size1[1], array2, size2[1], merge);

        printArray(merge, l);
    }

    public static int mergeArray(int[] array1, int n, int[] array2, int m, int[] merge){
        int count = 0, i = 0, j = 0;
        while(i < n && j < m){
            if(array1[i] == array2[j]){
                merge[count++] = array1[i++];
                j++;
            }
            else if(array1[i] > array2[j]){
                merge[count++] = array2[j++];
            }
            else if(array1[i] < array2[j]){
                merge[count++] = array1[i++];
            }
        }

        while(i < n){
            merge[count++] = array1[i];
            i++;
        }

        while(j < m){
            merge[count++] = array2[j];
            j++;
        }

        return count;
    }

    public static int removeDuplicates(int[] array, int n){
        for(int i = 0; i < n - 1; i++){
            if(array[i] == array[i + 1]){
                leftShift(array, n, i + 1);
                n--;
                i--;
            }
        }
        return n;
    }

    public static void leftShift(int[] array, int n, int start){
        for(int i = start + 1; i < n; i++){
            array[i - 1] = array[i];
        }
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

    public static void extractArray(String str, int n, int[] array){
        int start = 0, j = 0, i = 0;
        for(; i < n; i++){
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

    public static void printArray(int[] array, int n){
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}


/*abstract

2,4,5,6,7,9,10,13
2,3,4,5,6,7,8,9,11,15

2,4,5,6,7,9,10,13
2,3,4,5,6,7,8,9,11,15

1 )

    2,4,5,6,7,9,10,13
    2,3,4,5,6,7,8,9,11,15

    2 3 4 5 6 7 8 9 10 11 13 15 

2 )

    1,1,1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,7,7,7,8,8,9
    1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,3,3,3,3,4,4,7,8,9,10,10,20,30,40

    1 2 3 4 5 6 7 8 9 10 20 30 40

*/