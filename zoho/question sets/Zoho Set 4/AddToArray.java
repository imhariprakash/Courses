import java.util.Scanner;
public class AddToArray {
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     int n1=sc.nextInt();
     int a[]=new int[n1];
     for(int i=0;i<n1;i++)
     a[i]=sc.nextInt();
     System.out.println("enter second");
     int n2=sc.nextInt();
     int b[]=new int[n2];
     for(int i=0;i<n2;i++)
     b[i]=sc.nextInt();
     add(a,b);
     sc.close();
   } 
   static void add(int a[],int b[])
   {
     // String s="";
     long s=0,d=1;
      int i=a.length-1,c=0,j=b.length-1;
      while(i>=0 || j>=0)
      {
         if(i>=0 && j>=0)
         {
            c=c+a[i]+b[j];
            i--;
            j--;
         }
         else if(i>=0)
         {
            c=c+a[i];
            i--;
         }
         else if(j>=0)
         {
            c=c+b[j];
            j--;
         }
         s=s+(c%10)*d;
         c=c/10;
         d=d*10;
      }
      if(c!=0)
      s=s+(c%10)*d;
      System.out.print(s);
   }
}
