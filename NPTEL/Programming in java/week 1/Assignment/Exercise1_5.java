// Complete the code segment to help Ragav , find the highest mark and average mark secured by him in "s" number of subjects.

import java.util.Scanner;
public class Exercise1_5{
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        int i;
        int s;
        //define size of array
        s = input.nextInt();
        //The array is defined "arr" and inserted marks into it.
        int[] arr = new int[s];   
        for(i=0;i<arr.length;i++)
	    {
	        arr[i]=input.nextInt();
        }

        //Initialize maximum element as first element of the array.  
        //Traverse array elements to get the current max.
        //Store the highest mark in the variable result.
        //Store average mark in avgMarks.arr[i

        int max=0;
        float average=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i] > max)
            max=arr[i];
            average+=arr[i];
        }
        System.out.println(max);
        System.out.print(average/arr.length);
        input.close();
    }
}