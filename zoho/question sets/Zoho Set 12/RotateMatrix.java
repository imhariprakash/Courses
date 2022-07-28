public class RotateMatrix {
    public static void main(String[] args)
    {
        int n[][]={{1,2,3},
                   {4,5,6},
                   {7,8,9}};
        int a[][]={{3,6,9},
                   {2,5,8},
                   {1,4,7}};
        System.out.println(checknighty(n,a));
    }
    static boolean checknighty(int n[][],int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                swap(a,i,j);
            }
        }
        for(int i=0;i<a.length;i++)
        reverse(a,i);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]!=n[i][j])
                return false;
            }
        }
        return true;
    }
    static void swap(int a[][],int i,int j)
    {
        int tem=a[i][j];
        a[i][j]=a[j][i];
        a[j][i]=tem;
    }
    static void reverse(int a[][],int l)
    {
        int k=a[l].length-1;
        int i=0;
        while(i<k)
        {
            swapelement(a,l,i,k);
            k--;
            i++;
        }
    }
    static void swapelement(int a[][],int i,int j,int l)
    {
        int temp=a[i][j];
        a[i][j]=a[i][l];
        a[i][l]=temp;
    }
}
