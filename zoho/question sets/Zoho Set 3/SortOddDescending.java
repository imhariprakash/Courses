public class SortOddDescending {
    public static void main(String[] args)
    {
        int n[]={13,2,4,15,12,10,5,1};
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(n[i]<n[j])
                {
                    swap(n,i,j);
                }
            }
        }
        for(int k=0;k<n.length;k++)
        System.out.print(n[k]+" ");
        System.out.println();
        int i=1,j=0;
        if(n.length%2==0)
        {
            j=n.length-1;
        }
        else
        j=n.length-2;
        while(i<j)
        {
            swap(n,i,j);
            i=i+2;
            j=j-2;
        }
        for(int k=0;k<n.length;k++)
        System.out.print(n[k]+" ");
    }
    static void swap(int n[],int i,int j)
    {
        n[i]=n[i]+n[j]-(n[j]=n[i]);
    }
}
