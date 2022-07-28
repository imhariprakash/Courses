public class Lexicographic {
    public static void main(String[] args)
    {
        String a[]={"Hi","Aathi","aathi","geeksforgeeks","geeksfor","geeks"};
        lexi(a);
    }
    static void lexi(String a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i].charAt(0)>a[j].charAt(0))
                {
                    String s=a[i];
                    a[i]=a[j];
                    a[j]=s;
                }
                else if(a[i].charAt(0)==a[j].charAt(0))
                {
                    int k,l;
                    for(k=0,l=0;l<a[i].length() && k<a[j].length() && a[i].charAt(k)==a[j].charAt(l);k++,l++);
                    if(a[j].length()==l)
                    swap(a,i,j);
                    else if(a[i].charAt(k)>a[j].charAt(l))
                    swap(a,i,j);
                }
            }
        }
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
    static void swap(String a[],int i,int j)
    {
        String str=a[i];
        a[i]=a[j];
        a[j]=str;
    }
}
