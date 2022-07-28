import java.util.Scanner;
public class Pattern {
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     printpattern(n);
     sc.close();
   }
   static void printpattern(int n)
   {
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               int min=i<j?i:j;
               min=min<n-i?min:n-i-1;
               min=min<n-j-1?min:n-j-1;
               System.out.print(n-min);
           }
           System.out.println();
       }
   } 
}
