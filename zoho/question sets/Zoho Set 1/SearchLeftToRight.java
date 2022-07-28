import java.util.Scanner;
public class SearchLeftToRight {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String sub=sc.next();
        char a[][]=new char[(int)Math.sqrt(str.length())+1][(int)Math.sqrt(str.length())+1];
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(k<str.length())
                {
                a[i][j]=str.charAt(k);
                k++;
                }
            }
        }
          //System.out.println(
              find(a,sub);
              sc.close();
    }
        static void find(char a[][],String sub)
        {
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[i].length;j++)
                {
                    if(a[i][j]==sub.charAt(0))
                    {
                        if((j<a[i].length-1) && checkright(a,i,j+1,sub,1));
                        if((i<a.length-1)&&checkdown(a,i+1,j,sub,1));
                    }
                }
            }
            //return false;
        }
        static boolean checkright(char a[][],int i,int j,String s,int k)
        {
            if(k==s.length())
            {
                if(j==a[i].length-1)
                System.out.print("("+i+","+(j-k+1)+")");
                else
                System.out.print("("+i+","+(j-k-1)+") ");
                System.out.print("("+i+","+j+")");
                return true;
            }
            if(j==a[i].length)
            return false;
            if(a[i][j]==s.charAt(k))
            {
                k++;
                return(((j<a[i].length-1)&&checkright(a,i,j+1,s,k))||(checkright(a,i,j,s,k)));
            }
            return false;
        }
        static boolean checkdown(char a[][],int i,int j,String s,int k)
        {
            if(k==s.length())
            {
                System.out.print("("+(i-k)+","+j+") ");
                System.out.print("("+(i-1)+","+j+")");
                return true;
            }
            if(i==a.length)
            return false;
            if(a[i][j]==s.charAt(k))
            {
                k++;
                return(((i<a.length-1)&&checkdown(a,i+1,j,s,k))||checkdown(a,i,j,s,k));
            }
            return false;
        }
}
