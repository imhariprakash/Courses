import java.util.Scanner;
public class PrintUniqueCharacter{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printunique(str);
        sc.close();
    }
    static void printunique(String str)
    {
        int i=0;
        for(i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)!=str.charAt(i+1))
            System.out.print(str.charAt(i));
        }
        System.out.print(str.charAt(i));
    }
}