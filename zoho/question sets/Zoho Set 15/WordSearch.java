import java.util.Scanner;
public class WordSearch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char a[][]={{'a','z','o','l'},
                    {'n','x','h','o'},
                    {'v','y','i','v'},
                    {'o','r','s','e'}};
        String dic[]={"van","zoho","love","are","is"};
        for(int k=0;k<dic.length;k++)
        {
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[i].length;j++)
                {
                    if(a[i][j]==dic[k].charAt(0))
                    if(((i!=a.length-1)&&(search(a,dic[i],i+1,j,1)))||((j!=a[i].length-1)&&(search(a,dic[i],i,j+1,1))))
                    System.out.println(dic[k]);
                }
            }
        }
    }
    static boolean search(char a[][],String str,int r,int c,int k)
    {
        //System.out.println(str.charAt(k));
        if(k==str.length())
        return true;
        if(r==a.length && c==a[r].length)
        return false;
        if(a[r][c]==str.charAt(k))
        {
            k++;
            if(c!=a[r].length)
            {
                if(r!=a.length-1&&(search(a,str,r+1,c,k)||(search(a,str,r,c+1,k))))
                return true;
                else if(search(a,str,r,c+1,k))
                return true;
            }
            else
            {
                if((r!=a.length-1) && search(a,str,r+1,c,k))
                return true;
                else if(search(a,str,r,c,k))
                return true;
            }
        }
        return false;
    }
}
