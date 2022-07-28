public class Path {
    public static void main(String[] args)
    {
        char n[][]={{'1','1','0','0'},
                    {'1','0','0','1'},
                    {'1','1','1','1'},
                    {'0','0','0','1'}};
        if(check(n,0,0));
        for(int i=0;i<n.length;i++)
        {
            for(int j=0;j<n[i].length;j++)
            {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean check(char n[][],int r,int c)
    {
        if(r==n.length && c==n[0].length)
        return true;
        if(n[r][c]=='0')
        return false;
        if(n[r][c]=='1')
        {
            n[r][c]='-';
            if(!((r<n.length-1 && check(n,r+1,c)) || (c<n[0].length && check(n,r,c+1))||(r==n.length && (c<n[0].length && check(n,r,c+1)))||(c==n[0].length && (r<n.length-1 && check(n,r+1,c)))||(r==n.length && c==n[0].length &&(check(n, r, c)))))
            {
                System.out.println(r+"="+c);
                n[r][c]='1';
            }
        }
        return false;
    }
}
