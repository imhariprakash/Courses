import java.util.Scanner;
 
class myClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printExpanded(str);
        sc.close();  
    }

    public static void printExpanded(String str){
        int temp = 0;
        char ch = str.charAt(0);
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                for(int j = 0; j < temp; j++){
                    System.out.print(ch);
                }
                ch = str.charAt(i);
                temp = 0;
            }
            else{
                temp = temp * 10 + (str.charAt(i) - '0');
            }
        }
        for(int j = 0; j < temp; j++){
            System.out.print(ch);
        }  
    }
}