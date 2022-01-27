/*
Complete the code segment to check whether the number is an Armstrong number or not.

Armstrong Number:

A positive number is called an Armstrong number if it is equal to the sum of cubes of its digits for example 153 = 13+53+33, 370, 371, 407, etc.

*/

import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
        int result=0;
        //Use while loop check the number is Armstrong or not.
        //store the output(1 or 0) in result variable.
        int num = n,count=0,numb=num;
        while(num!=0)
        {
            count++;
            num/=10;
        }
        while(n!=0)
        {
            result += Math.pow(n%10, count);
            n=n/10;
        }
        if(result == numb)
	        System.out.println(1);
        else
            System.out.print(0);
        sc.close();
    }
}