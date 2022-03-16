import java.util.Scanner;
class LargestPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = getLength(str);
        System.out.println(n);
        int [] array = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        getCount(str,array, n);
        int max = getMax(array);
        char[] pal = new char[max];
        getPal(array, pal, max);
        sc.close();
    }

    public static void getPal(int[] array, char[] pal, int max){
        char ch = ' ';
        int i, count = 0;
        for(i = 0 ; i < 26; i++){
            if(array[i] > 1){
                for(int j = 0; j < array[i] / 2; j++){
                    pal[count] = (char)(array[i] + 97);
                    pal[max - count - 1] = (char)(array[i] + 65); 
                    count++;
                }
            }
            else{
                ch = (char)(array[i] + 97);
            }
        }
        pal[count] = ch;
        printArray(pal, max);
    }

    public static int getMax(int[] array){
        int count = 0;
        boolean flag = false;
        for(int i = 0; i < 26; i++){
            if(array[i] > 1 && array[i] % 2 == 0){
                count += array[i];
            }
            else if(array[i] > 1 && array[i] % 2 != 0){
                count += (array[i] - 1);
            }
            else{
                flag = true;
            }
        }
        if(flag){
            count++;
        }
        return count;
    }

    public static int getLength(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count++);
            }
        }catch(Exception e){
            return(count - 1);
        }
    }

    public static void getCount(String str, int[] array, int n){
        for(int i = 0; i < n; i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                array[(int)(str.charAt(i) - 97)]++;
            }
            else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                array[(int)(str.charAt(i) - 65)]++;
            }
        }
    }

    public static void printArray(int[] array, int n){
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void printArray(char[] array, int n){
        System.out.println();
        for(int i = 0; i < n; i++){
            if(array[i] >= 'A' && array[i] <= 'Z')
                array[i] += 32;
            System.out.print(array[i]);
        }
    }
}

/*----------------------------------------------------------------

This is a sample text for testing

Find out the biggest possible palindorme using the char of a given set of words.
if multiple palindormes of the same size can be formed then it is enough if one of them is printed

input : This is a Sample text for testing
output : max possible palindrome : 15 characters
         eg : ttissaepeassitt

This is a Sample text for testing
cddeeffaffeeddc

*/