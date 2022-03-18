import java.util.Scanner;
class Flames{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int n1 = getLength(str1);
        int n2 = getLength(str2);
        int[] alpha1 = new int[26];
        int[] alpha2 = new int[26];
        getCount(str1, n1, alpha1);
        getCount(str2, n2, alpha2);
        minus(alpha1, alpha2);
        int num = sum(alpha1, alpha2);
        getFlames(num);
    }

    public static void getFlames(int n){
        while(n > 6){
            n -= 5;
        }

        switch(n){
            case 1 :
                System.out.println("Friends");
                break;
            case 2 :
                System.out.println("Lovers");
                break;
            case 3 :
                System.out.println("Affection");
                break;
            case 4 :
                System.out.println("Marriage");
                break;
            case 5 :
                System.out.println("Enemies");
                break;
            case 6 :
                System.out.println("Siblings");
                break;
        }
    }

    public static void minus(int[] array1, int[] array2){
        for(int i = 0; i < array1.length; i++){
            if(array1[i] > 0 &&  array2[i] > 0){
                array1[i] = 0;
                array2[i] = 0;
            }
        }
    }

    public static int sum(int[] array1, int[] array2){
        int num = 0;
        for(int i = 0; i < 26; i++){
            num += array1[i];
            num += array2[i];
        }
        return num;
    }

    public static void getCount(String str, int n1, int[] array){
        for(int i = 0; i< n1; i++){
            if(lower(str.charAt(i)) >= 'a' && lower(str.charAt(i)) <= 'z'){ 
                array[(int)(lower(str.charAt(i)) - 97)]++;
            }
        }
    }

    public static char lower(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            return((char)(ch + 32));
        }
        return(ch);
    }

    public static void printArray(int[] array, int n){
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
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
}