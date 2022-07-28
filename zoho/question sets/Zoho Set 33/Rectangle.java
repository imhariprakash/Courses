public class Rectangle{
    public static void main(String[] args)
    {
        int n[][]={{1,2,3,4,6},
                   {5,3,8,1,2},
                   {4,6,7,5,5},
                   {2,4,8,9,4}};
        rect(n);
    }
    static void rect(int n[][])
    {
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(sum(i,n)==sum(j,n))
                {
                    System.out.println("true");
                    System.out.println("("+i+","+0+") and ("+j+","+n[i].length+")");
                    System.out.println(2*sum(i,n));
                }
            }
        }
    }
    static int sum(int i,int n[][])
    {
        int s=0;
        for(int j=0;j<n[i].length;j++)
        s=s+n[i][j];
        return s;
    } 
}