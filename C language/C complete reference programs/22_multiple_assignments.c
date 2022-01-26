#include<stdio.h>
#include<stdlib.h>

int main()
{
    int x,y;
    x=(y=3,y=4);
    printf("x: %d\ny: %d\n",x,y);
    x=1,2,3,4;
    printf("x: %d\n",x);
    x=(1,2,3,4);
    printf("x: %d\n",x);
}