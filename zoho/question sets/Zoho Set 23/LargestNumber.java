import java.util.Scanner;
public class LargestNumber {
    static int s=Integer.MIN_VALUE; 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        a[i]=sc.next();
        int d=sc.nextInt();
        combination(a,d);
        System.out.println(s);
        sc.close();
    }
    static void combination(String a[],int d)
    {
        for(int i=1;i<=d;i++)
        {
            combo(a,i,d);
        }
    }
    static void combo(String a[],int i,int d)
    {
        String k[]=new String[i];
        allcombinations(a,k,0,a.length-1,0,i,d);
    }
    static void allcombinations(String a[],String k[],int start,int end,int index,int l,int d)
    {
        if(index==l)
        {
           int digit=digits(k);
            if(digit<=d)
            {
                largest(k);
            }
            return;
        }
        for(int i=start;i<=end && end-i+1>=l-index;i++)
        {
            k[index]=a[i];
            allcombinations(a,k,i+1,end,index+1,l,d);
        }
    }
    static int digits(String k[])
    {
        int c=0;
        for(int i=0;i<k.length;i++)
            c=c+k[i].length();
        return c;
    }
    static void largest(String k[])
    {
        String du[]=new String[k.length];
        for(int i=0;i<k.length;i++)
        du[i]=k[i];
        for(int i=0;i<k.length;i++)
        {
            for(int j=i+1;j<k.length;j++)
            {
                String str=du[i]+du[j];
                String st=du[j]+du[i];
                if(check(str)<check(st))
                {
                    String l=du[i];
                    du[i]=du[j];
                    du[j]=l;
                }
            }
        }
        String m="";
        for(int i=0;i<k.length;i++)
        m=m+du[i];
        if(check(m)>s)
            s=check(m);
    }
    static int check(String str)
    {
        int n=0;
        for(int i=0;i<str.length();i++)
        n=n*10+str.charAt(i)-48;
        return n;
    }
}
