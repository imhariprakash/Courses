import java.util.Scanner;
class DuplicatesArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] size = getCount(str);
        int[] array = new int[size[1]];
        extractSetArray(str, array, size);
        Counter(array, size[1]);
        sc.close();
    }

    public static void Counter(int[] array, int n){
        int temp = array[0], count;
        for(int i = 0; i < n - 1; i++){
            count = 0;
            if(i == 0)
                count = match(array, 0, n, temp);
            else if(i != 0 && array[i] != temp)
                count = match(array, i, n, temp);
            if(count > 1){
                System.out.println(array[i] + " -> " + count);
            }
        }
    }

    public static int match(int[] array, int start, int n, int temp){
        int count = 1;
        for(int i = start + 1; i < n; i++){
            if(array[i] == array[start]){
                count++;
                array[i] = temp;
            }
        }
        return count;
    }

    public static void extractSetArray(String str, int[] array, int[] size){
        int start = 1, j = 0, i, end;
        for(i = 0; i < size[0]; i++){
            if(str.charAt(i) == ',' || str.charAt(i) == ']'){
                end = i - 1;
                array[j++] = getNumber(str, start, end);
                start = i + 1;
            }
        }
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

    public static int[] getCount(String str){
        int[] size = {0, 1};
        try{
            while(true){
                str.charAt(size[0]);
                if(str.charAt(size[0]++) == ','){
                    size[1]++;
                }
            }
        }catch(Exception e){
            return size;
        }
    }

    public static void printArray(int[] array, int n){
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}

/*abstract

2. Write a program to find the duplicate numbers in an array and their occurrences.

Store the duplicate numbers in a separate array and print the output.

Input : [ 1, 2, 4, 5, 2, 1, 5, 2, 10, 22, 5 ]
Output:
1 -> 2
2 -> 3
5 -> 3


*/