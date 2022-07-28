import java.util.Scanner;
public class TotalCharacters {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countcharacter(n));
        sc.close();
    }    
    static int countcharacter(int n)
    {
        int count=0;
        for(int i=1;i<=n;i=i*10)
        count=count+n-i+1;
        return count;
    }
}
