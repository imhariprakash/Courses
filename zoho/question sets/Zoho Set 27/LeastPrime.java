import java.util.Scanner;
public class LeastPrime {
    static Scanner sc=new Scanner(System.in);
    static int n=sc.nextInt();
    static int c[]=new int[n];
    public static void main(String[] args)
   {
       int a[]=new int[n];
       int b[]=new int[n];
       for(int i=0;i<n;i++)
       a[i]=sc.nextInt();
       for(int i=0;i<n;i++)
       b[i]=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           System.out.print(c[i]+" ");
       }
       System.out.println();
       prime(a,b,n);
       for(int i=0;i<n;i++)
       {
           System.out.print(c[i]+" ");
       }
   } 
   static void prime(int a[],int b[],int n)
   {
       int f=0,j;
       for(int i=0;i<n;i++)
       {
           if(a[i]%b[i]==0)
           c[i]=0;
           else
           {
               for(j=1;j<1000;j++)
               {
                   f=0;
                   for(int k=2;k<=(int)Math.sqrt(j);k++)
                   {
                       if(j%k==0)
                       {
                           f=1;
                           break;
                       }
                   }
                   if(f==0)
                   {
                       if((a[i]+j)%b[i]==0)
                       {
                            c[i]=j;
                            break;
                       }
                       else
                       f=1;
                   }
                }
                if(j>=1000 && f==1)
                   c[i]=-1;
           }
       }
   }
}
