import java.util.Scanner;
 
class VowelCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] array = getVowelCount(str);
        printArray(array);
        sc.close();
    }

    public static void printArray(int[] array){
        System.out.println();
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        for(int index = 0; index < array.length; index++){
            System.out.println(vowel[index] + " : " + array[index]);
        }
    }

    public static int[] getVowelCount(String str){
        int[] array = {0, 0, 0, 0, 0};
        for(int index = 0; index <= str.length() - 1; index++){
            switch(str.charAt(index)){
                case 'a':
                    array[0]++;
                    break;
                case 'e':
                    array[1]++;
                    break;
                case 'i':
                    array[2]++;
                    break;
                case 'o':
                    array[3]++;
                    break;
                case 'u':
                    array[4]++;
                    break;
            }
        }
        return array;
    }
}

/**

aeeiiioooouuuuuaaaaaeeeeiiioou

a : 6
e : 6
i : 6
o : 6
u : 6

*/