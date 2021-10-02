/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
void arra(int arr[])
{
    int i;
    for (i=0;i<5;i++)
    {
    printf("%d ",arr[i]);
    }
}

int main()
{
    int i,arr[5]={1,2,3,4,5};
    arra(arr);
    return 0;
}
