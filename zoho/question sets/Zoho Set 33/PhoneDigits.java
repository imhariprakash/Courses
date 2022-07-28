import java.util.Scanner;
public class PhoneDigits {
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       char n[][]={{},{},
                   {'A','B','C'},
                   {'D','E','F'},
                   {'G','H','I'},
                   {'J','K','L'},
                   {'M','N','O'},
                   {'P','Q','R','S'},
                   {'T','U','V'},
                   {'W','X','Y','Z'}};
        int l=sc.nextInt();
        int k[]=new int[l];
        for(int i=0;i<l;i++)
        k[i]=sc.nextInt();
        combine(n,k," ",0,l);
        sc.close();
   } 
   static void combine(char n[][],int k[],String s,int index,int l)
   {
        if(index==l)
        {
            System.out.println(s);
            return;
        }
        int d=k[index];
        int le=n[d].length;
        for(int i=0;i<le;i++)
        combine(n,k,s+n[d][i],index+1,l);
   }
}
