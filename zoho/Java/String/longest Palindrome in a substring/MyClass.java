import java.util.*;
public class MyClass {
    public static int myvar = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();//Malayalam Googlelgoog
        int start = 0,end =0;
        for(int i=0;i<str.length() ;i++){
            int arr[] = longestPalindrome(str,i,str.length()-1);
            if(end-start < arr[1]-arr[0]){
                start = arr[0];
                end = arr[1];
            }
        }
        for(int i=start;i<=end;System.out.print(str.charAt(i++)));
        System.out.println("\n" + myvar);
    }
    private static int[] longestPalindrome(String str, int i, int j){
        int arr[] = new int[2],start=-1,end=-1,count=-1, c=i;
        while(i < j){
            if(str.charAt(i) == str.charAt(j) || str.charAt(i)+32 ==  str.charAt(j) || str.charAt(j)+32 == str.charAt(i)) {
                if(count == -1){
                    start = i;
                    end=j;
                }
                count++;
                i++; 
            }
            else{
                count=start=end=-1;
                i=c;
            } 
            j--;
        }
        arr[0] = start;
        arr[1] = end;
        return arr;
    }
}