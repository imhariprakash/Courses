public class Sudoku {
    public static void main(String[] args)
    {
        int s[][]={{5,1,3,6,8,7,2,4,9},
                   {8,4,9,5,2,1,6,3,7},
                   {2,6,7,3,4,9,5,8,1},
                   {1,5,8,4,6,3,9,7,2},
                   {9,7,4,2,1,8,3,6,5},
                   {3,2,6,7,9,5,4,1,8},
                   {7,8,2,9,3,4,1,5,6},
                   {6,3,5,1,7,2,8,9,4},
                   {4,9,1,8,5,6,7,2,3}};
        int b[]=new int[10];
        if(check(s,b))
        System.out.println("valid");
        else
        System.out.println("Invalid");
    }
    static boolean check(int s[][],int b[])
    {
        if(row(s,b)&&column(s,b) &&mat(s,b))
        return true;
        return false;
    }
    static boolean row(int s[][],int b[])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(b[s[i][j]]!=0)
                {
                    return false;
                }
                b[s[i][j]]++;
            }
            for(int k=0;k<b.length;k++)
            b[k]=0;
        }
        return true;
    }
    static boolean column(int s[][],int b[])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(b[s[j][i]]!=0)
                return false;
                b[s[j][i]]++;
            }
            for(int k=0;k<b.length;k++)
            b[k]=0;
        }
        return true;
    }
    static boolean mat(int s[][],int b[])
    {
        for(int i=0;i<9;i=i+3)
        {
            for(int j=0;j<9;j=j+3)
            {
                for(int m=i;m<i+3;m++)
                {
                    for(int n=j;n<j+3;n++)
                    {
                        if(b[s[m][n]]!=0)
                        return false;
                        b[s[m][n]]++;
                    }
                }
               for(int k=0;k<b.length;k++)
               b[k]=0;
            }
        }
        return true;
    }
}
