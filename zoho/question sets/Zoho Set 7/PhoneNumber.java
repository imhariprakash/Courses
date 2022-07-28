public class PhoneNumber{
    public static void main(String[] args)
    {
        char a[][]={{},{},
                    {'a','b','c'},
                    {'d','e','f'},
                    {'g','h','i'},
                    {'j','k','l'},
                    {'m','n','o'},
                    {'p','q','r','s'},
                    {'t','u','v'},
                    {'w','x','y','z'}};
        int n[]={2,3,9};
        String str=" ";
        findcombo(a,n,str,0,n.length);
    }
    static void findcombo(char a[][],int n[],String str,int index,int l)
    {
        if(l==index)
        {
            System.out.println(str);
            return;
        }
        int d=n[index];
        int len=a[d].length;
        for(int i=0;i<len;i++)
        findcombo(a,n,str+a[d][i],index+1,l);
    }
}