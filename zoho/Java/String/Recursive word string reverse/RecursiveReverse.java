import java.util.Scanner;

class RecursiveReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine();
        int n = getLength(sent);
        System.out.print(n);
        String[] str = new String[n];
        sc.close();
        sc = new Scanner(sent);
        int i = 0;
        while(sc.hasNextLine()){
            str[i++] = sc.next();
        }

        recursive(str, 0, n - 1);

        printArray(str, n);
        sc.close();
    }

    public static void recursive(String[] str, int start, int end){
        if(start >= end){
            return;
        }
        else{
            swap(str, start, end);
            recursive(str, start + 1, end - 1);
        }
    }

    public static void swap(String[] str, int start, int end){
        String temp = str[start];
        str[start] = str[end];
        str[end] = temp;
    }

    public static void printArray(String[] array, int n){
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int getLength(String str){
        int count = 1, i = 0;
        try{
            while(true){
                if(str.charAt(i) == ' '){
                    count++;
                }
                i++;
            }
        }catch(Exception e){
            return count;
        }
    }
}

/*----------------------------------------------------------------

6. Using Recursion reverse the string such as

Eg 1: Input: one two three
      Output: three two one
Eg 2: Input: I love india
      Output: india love I 

get array elements until next line in java
8
java in line next until elements array get 

*/