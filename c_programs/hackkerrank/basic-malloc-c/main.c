/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i,n=5,*a;
    a=(int*)malloc(sizeof(int));
    for(i=0;i<n;i++)
    scanf("%d",a+i);
    for(i=0;i<n;i++)
    printf("%d\t",*(a+i));

    return 0;
}
