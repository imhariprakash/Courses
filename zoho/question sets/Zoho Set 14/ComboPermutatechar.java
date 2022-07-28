import java.util.Scanner;
public class ComboPermutatechar {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=length(str);
        for(int i=1;i<=n;i++)
        {
            char a[]=new char[i];
            combination(str,a,0,n-1,0,i);
        }
        sc.close();
    }    
    static void combination(String str,char a[],int s,int e,int index,int r)
    {
        if(index==r)
        {
            //System.out.println(a);
            permutate(a,0,r);
            return;
        }
        for(int i=s;i<=e && e-i+1>=r-index;i++)
        {
            a[index]=str.charAt(i);
            combination(str, a, i+1, e, index+1, r);
        }
    }
    static void permutate(char a[],int s,int n)
    {
        if(s==n)
        {
            System.out.println(a);
        }
        for(int i=s;i<n;i++)
        {
            a[i]=(char)(a[i]+a[s]-(a[s]=a[i]));
            permutate(a,s+1,n);
            a[i]=(char)(a[i]+a[s]-(a[s]=a[i]));
        }
    }
    static int length(String str)
    {
        int i=0;
        while(true)
        {
            try{
                str.charAt(i);
                i++;
            }
            catch(Exception e)
            {
                return i;
            }
        }
    }
}
