public class Matrixrotate {
    public static void main(String[] args)
    {
        int n[][]={{1,2,3},
                   {4,5,6},
                   {7,8,9}};
        reverse(n);
        transpose(n);
        for(int i=0;i<n.length;i++)
        {
            for(int j=0;j<n.length;j++)
            {
                System.out.print(n[i][j]);
            }
            System.out.println();
        }
    }
    static void reverse(int n[][])
    {
       int i=0,l=n.length;
       while(i<l)
       {
           int j=0,k=n[i].length-1;
           while(j<k)
           {
                n[i][j]=n[i][j]+n[i][k]-(n[i][k]=n[i][j]);
                j++;
                k--;
           }
           i++;
       }
    }
    static void transpose(int n[][])
    {
        for(int i=0;i<n.length;i++)
        for(int j=i;j<n.length;j++)
        n[i][j]=n[i][j]+n[j][i]-(n[j][i]=n[i][j]);
    }
}
