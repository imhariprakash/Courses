/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int n,i,j,k,t;
    printf("Enter the number of rows: ");
    scanf("%d",&n);
    printf("Enter the number of columns: ");
    scanf("%d",&t);
   for(i=0;i<n;i++)
   {
       for(k=0;k<n-1-i;k++)
       {
           printf("  ");
       }
       for(j=0;j<t;j++)
       {
           if(i==0 || j==0 || i==n-1 || j==t-1)
           {
               printf("* ");
           }
           else
               printf("  ");
       }
       printf("\n");
   }
    
}
