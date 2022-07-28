public class Pathone {
    public static void main(String[] args)
    {
        char a[][]={{'1','1','0','0'},
                    {'1','0','0','1'},
                    {'1','1','1','1'},
                    {'0','0','0','1'}};
       if(rightdown(a,0,0));
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean rightdown(char a[][],int start,int end)
    {
        if(start==a.length && end==a[start].length)
            return true;

        if(a[start][end]=='1')
        {
            a[start][end]='-';    
                if(end!=a[start].length-1 )
                {
                    if((start!=a.length-1)&&(rightdown(a,start,end+1)||rightdown(a, start+1, end)))
                        return true;
                    else if(rightdown(a, start, end+1))
                        return true; 
                }
                else
                {
                    if((start!=a.length-1)&&(rightdown(a, start+1, end)))
                    return true;
                    else if(rightdown(a, start, end))
                    return true;
                }
        }
        return false;
    }
}
