public class SearchstringIn2D {
    public static void main(String[] args)
    {
        char a[][]={{'p','w','x','c','t'},
                    {'b','o','o','a','l'},
                    {'x','o','b','o','x'},
                    {'x','l','o','o','e'},
                    {'a','c','x','t','x'}};
        String str="box";
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]==str.charAt(0))
                {
                    if(right(a, str,0,i,j,a.length,a[0].length,1))
                    {
                        System.out.print("Right : ");
                        System.out.println(i+","+j+"  "+i+","+(j+str.length()-1));
                    }
                    if(down(a,str,0,i,j,a.length,a[0].length,1))
                    {
                        System.out.print("Down : ");
                        System.out.println(i+","+j+"  "+(i+str.length()-1)+","+j);
                    }
                    if(right(a,str,0,i,j,0,0,-1))
                    {
                        System.out.print("Left : ");
                        System.out.println(i+","+j+"  "+i+","+(j-str.length()+1));
                    }
                    if(down(a,str,0,i,j,0,0,-1))
                    {
                        System.out.print("Up : ");
                        System.out.println(i+","+j+"  "+(i-str.length()+1)+","+j);
                    }
                    if(diagonal(a,str,0,i,j,a.length,a[0].length))
                    {
                        System.out.print("Diagonal : ");
                        System.out.println(i+","+j+"  "+(i+str.length()-1)+","+(j+str.length()-1));
                    }
                }
            }
        }
    }
    static boolean right(char a[][],String str,int len,int r,int c,int row,int col,int f)
    {
        if(str.length()==len)
            return true;
        if((f==1&&c==col)||(f==-1 && c==-1))
        return false;
        if(a[r][c]==str.charAt(len))
        return right(a,str,len+1,r,c+f,row,col,f);
        return false;
    }
    static boolean down(char a[][],String str,int len,int r,int c,int row,int col,int f)
    {
        if(str.length()==len)
        return true;
        if((f==1&&r==row)||(f==-1 && r==-1))
        return false;
        if(a[r][c]==str.charAt(len))
        return down(a,str,len+1,r+f,c,row,col,f);
        return false;
    }
    static boolean diagonal(char a[][],String str,int len,int r,int c,int row,int col)
    {
        if(str.length()==len)
        return true;
        if(r==row || c==col)
        return false;
        if(a[r][c]==str.charAt(len))
        return diagonal(a,str,len+1,r+1,c+1,row,col);
        return false;
    }
}
