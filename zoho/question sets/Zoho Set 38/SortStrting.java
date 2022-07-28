import java.util.Scanner;
public class SortStrting {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }
        sort(str,n);
        for(int i=0;i<n;i++)
        System.out.print(str[i]+" ");
    }    
    static void sort(String str[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(length(str[i])>length(str[j]))
                {
                    swap(str,i,j);
                }
                else if(length(str[i])==length(str[j]))
                {
                    if(check(str[i],str[j]))
                    {
                        swap(str,i,j);
                    }
                }
            }
        }
    }
    static boolean check(String a,String b)
    {
        for(int i=0;i<length(a);i++)
        {
            if(a.charAt(i)>b.charAt(i))
            return true;
            else if(a.charAt(i)<b.charAt(i))
            return false;
        }
        return false;
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
    static void swap(String str[],int i,int j)
    {
        String t=str[i];
        str[i]=str[j];
        str[j]=t;
    }
}
