import java.util.Scanner;
 
class Program31{
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
            
            if(str.charAt(i) ==  str.charAt(i + 1)){
                count++;
            }
            else{
                result +=  count > 1 ? str.charAt(i) + "" + count : str.charAt(i);
                count = 1;
            }
        }
        result +=  count > 1 ? str.charAt(i) + "" + count : str.charAt(i);
            

        return result;
    }
}