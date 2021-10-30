/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int m,j,k,n,i,count=0;
    printf("Enter the no. of elements of array: ");
    scanf("%d",&n);
    int arr[n];
    for(m=0;m<n;m++)
    {
        printf("Enter the element %d : ",m);
        scanf("%d",&arr[m]);
    }
    for(i=0;i<n-2;i++)
    {
        for(j=i+1;j<n-1;j++)
        {
            for(k=j+1;k<n;k++)
            {
                if(((arr[i]+arr[j])>arr[k])&&((arr[j]+arr[k])>arr[i])&&((arr[k]+arr[i])>arr[j]))
                {
                  count+=1;
                  printf("(%d,%d,%d)   ",arr[i],arr[j],arr[k]);
                }
            }
        }
    }
    if(count > 0)
    printf("\nWe can form %d triangles from the given numbers!",count);
    if(count==0)
    printf("We don't able to form a triangle from the given data!.");

    return 0;
}

