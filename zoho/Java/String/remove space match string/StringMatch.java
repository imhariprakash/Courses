import java.util.Scanner;

class StringMatch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int  i = 0, j = 0, count = 0;
        int len1 = length(str1);
        int len2 = length(str2);

        if(len1 != len2){
            System.out.println("false");
            return;
        }

        while(true){
            if(count == len1){
                break;
            }
            else if(!((str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') || (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z'))){
                i++;
            }
            else if(!((str2.charAt(j) >= 'a' && str2.charAt(j) <= 'z') || (str2.charAt(j) >= 'A' && str2.charAt(j) <= 'Z'))){
                j++;
            }
            else if(str1.charAt(i) == str2.charAt(j)){
                i++;
                j++;
                count++;
            }
            else if(str1.charAt(i) != str2.charAt(j)){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");

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