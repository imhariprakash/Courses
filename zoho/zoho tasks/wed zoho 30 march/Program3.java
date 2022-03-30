import java.util.Scanner;
 
class Program3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.next();
        str = compress(str);
        System.out.println(str);
        sc.close();
    }

    public static String compress(String str){
        int count = 1;
        String result = "";
        int i;
        for(i = 0; i < str.length() - 1; i++){
            int k = 1;
            while(i < str.length() - 1 && (str.charAt(i) ==  str.charAt(i + k))){
                i++;
                count++;
            }
            result +=  count > 1 ? str.charAt(i - 1) + "" + count : str.charAt(i - 1);
            count = 1;
        }
            

        return result;
    }
}