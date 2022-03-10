import java.util.Scanner;

class StringMatchRemoveSpace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int len1 = length(str1);
        int len2 = length(str2);

        if(len1 != len2){
            System.out.println("false");
        }
        else{
            char[] array1 = new char[len1];
            char[] array2 = new char[len1];
            getArray(str1, array1, len1);
            getArray(str2, array2, len1);
            if(isSame(array1, array2, len1)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }

    public static void getArray(String str1, char[] array, int n){
        int i = 0, j = 0;
        while(i != n){
            if((str1.charAt(j) >= 'a' && str1.charAt(j) <= 'z') ||(str1.charAt(j) >= 'A' && str1.charAt(j) <= 'Z')){
                array[i++] = str1.charAt(j);
            }
            j++;
        }
    }

    public static boolean isSame(char[] str1, char[] str2, int n){
        for(int i = 0; i < n; i++){
            if(str1[i] != str2[i]){
                return false;
            }
        }
        return true;
    }

    public static int length(String str){
        int count = 0, i = 0;

        try{
            while(true){
                if((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)){
                    count++;
                }
                i++;
            }
        }catch(Exception e){
            return count;
        }
    }
}