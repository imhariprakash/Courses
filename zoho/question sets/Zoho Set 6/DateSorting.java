public class DateSorting{
    public static void main(String[] args)
    {
        int Date[][]={{20,1,2014},
                      {25,3,2010},
                      {3,12,1676},
                      {18,11,1982},
                      {19,4,2015},
                      {9,7,2015}};
        sort(Date);
        for(int i=0;i<Date.length;i++)
        {
            System.out.println(Date[i][0]+","+Date[i][1]+","+Date[i][2]);
        }
    }
    static void sort(int d[][])
    {
        for(int i=0;i<d.length;i++)
        {
            for(int j=i+1;j<d.length;j++)
            {
                if(check(d,i,j))
                {
                    swap(d,i,j,0);
                    swap(d,i,j,1);
                    swap(d,i,j,2);
                }
            }
        }
    }
    static boolean check(int d[][],int i,int j)
    {
        if(d[i][2]>d[j][2])
        return true;
        if((d[i][2]==d[j][2])&&d[i][1]>d[j][1])
        return true;
        if( (d[i][2]==d[j][2] &&d[i][1]==d[j][1] )&& d[i][0]>d[j][0])
        return true;
        return false;
    }
    static void swap(int d[][],int i,int j,int l)
    {
        d[i][l]=d[i][l]+d[j][l]-(d[j][l]=d[i][l]);
    }
}