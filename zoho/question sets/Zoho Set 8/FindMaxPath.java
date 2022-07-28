public class FindMaxPath {
    public static void main(String[] args)
    {
        int a[][]={{15,25,30},
                   {45,25,60},
                   {70,75,10}};
        System.out.println(maxpath(a));
    }
    static int maxpath(int a[][])
    {
        int r[][]=new int[a.length][a[0].length];
        r[0][0]=a[0][0];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i==0 && j>0)
                {
                    r[i][j]+=r[i][j-1]+a[i][j];
                }
                else if(j==0 &&i>0)
                {
                    r[i][j]+=r[i-1][j]+a[i][j];
                }
                else if(i>0 && j>0)
                {
                    if(r[i-1][j]>r[i][j-1])
                    {
                        r[i][j]+=r[i-1][j]+a[i][j];
                    }
                    else
                    r[i][j]+=r[i][j-1]+a[i][j];
                }
            }
        }
        return(r[a.length-1][a[0].length-1]);
    }
}
