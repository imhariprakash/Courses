import java.util.*;

public class SumString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        getCount(str);
    }
    
    public static void getCount(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            sum += (int)str.charAt(i);
        }
        System.out.print(sum);
    }
}