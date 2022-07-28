import java.util.Scanner;
public class AddDigit {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int d=sc.nextInt();
        Add(n,d);
        sc.close();
    }
    static void Add(String n,int d)
    {
        String s="";
        int i=0;
        while(i<n.length())
        {
            int k=d+(int)n.charAt(i)-48;
            s=s+k;
            i++;
        }
        System.out.println(s);
    }
}
