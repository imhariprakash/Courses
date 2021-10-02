/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<stdio.h>

int main()
{
    int n,i,j,sum,count2=0,count3=0,k;
    printf("Enter the number of elements in the array: ");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
    scanf("%d",&arr[i]);}
    printf("Enter the sum: ");
    scanf("%d",&sum);
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            //We can do seperately for count2 and count3. Here I have done in a single step.check below
            //count2 and count3 in same step
            for(k=j+1;k<n;k++)
            {
                if(arr[i]+arr[j]+arr[k]==sum)
                count3+=1;
            }
            //for doing seperately lets remove up to this from k for loop
            if(arr[i]+arr[j]==sum)
            count2+=1;
        }
    }
    /*
    for(i=0;i<n-2;i++)
    {
        for(j=i+1;j<n-1;j++)
        {
            for(k=j+1;k<n;k++)
            {
            if(arr[i]+arr[j]+arr[k]==sum)
            count3+=1;
            }
        } 
    }*/
    if(count2!=0)
    printf("If two elements are added: %d\n",count2);
    else
    printf("No two elements add to the given sum.\n");
    if(count3!=0)
    printf("If three elements are added: %d",count3);
    else
    printf("No three elements add to the given sum.");
    
    
}
