import java.util.Scanner;
public class ValidExpression {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0,i;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(')
                count++;
            else if(str.charAt(i)==')')
            {
                if(count!=0)
                count--;
            }
            else if(!(((str.charAt(i)>='1')&&(str.charAt(i)<='9'))||((str.charAt(i)>='a')&&(str.charAt(i)<='z'))))
            {
                if(!((((str.charAt(i-1)>='1')&&(str.charAt(i-1)<='9'))&& ((str.charAt(i+1)>='1')&&(str.charAt(i+1)<='9')))||((((str.charAt(i-1)>='a')&&(str.charAt(i-1)<='z'))&& ((str.charAt(i+1)>='a')&&(str.charAt(i+1)<='z'))))))
                {
                    break;
                }
            }
        }
        if(count==0 && i==str.length())
        {
            System.out.println("valid input");
        }
        else 
        System.out.println("Not Valid");
    }
}
