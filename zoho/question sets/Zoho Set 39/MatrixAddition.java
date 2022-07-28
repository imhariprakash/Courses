import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
            if(num[i]>max)
            max=num[i];
        }
        int a[][]=new int[n][max];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<num[i];j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        addtoArrays(a,n,num);
        sc.close();
    }
    static void addtoArrays(int a[][],int n,int num[])
    {
        String s="",k="";
        for(int i=0;i<n;i++)
        {
            s="";
            for(int j=0;j<num[i];j++)
            {
                s+=a[i][j];   
            }
            k=addfunc(s,k);
        }
        System.out.println(k);
    }
    static String addfunc(String s,String k)
    {
        String m="";
        int i=s.length()-1,j=k.length()-1,l=0,c=0;
        while(i>=0 || j>=0)
        {
            if(i>=0 && j>=0)
            {
                l=(int)s.charAt(i)-48+(int)k.charAt(j)-48+c;
                m=(l%10)+m;
                c=l/10;
            }
            else if(i>=0)
            {
                l=(int)s.charAt(i)-48+c;
                m=(l%10)+m;
                c=l/10;
            }
            else if(j>=0)
            {
                l=(int)k.charAt(j)-48+c;
                m=(l%10)+m;
                c=l/10;
            }
            i--;
            j--;
        }
        if(c!=0)
        m=c+m;
        k=m;
        return k;
    }
}
