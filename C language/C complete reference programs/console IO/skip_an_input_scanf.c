#include<stdio.h>
#include<stdlib.h>

int main()
{
    int a,b,c;
    printf("Enter a point in the form (x,y,z): ");
    scanf("%d %*c %d %*c %d",&a,&b,&c); // * just skips that after reading
    printf("Point : (%d,%d,%d)\n",a,b,c);
}