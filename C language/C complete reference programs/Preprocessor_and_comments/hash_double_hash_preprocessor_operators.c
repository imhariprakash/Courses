#include<stdio.h>

#define mks(str) #str
#define concat(a,b)  a ## b


int main()
{
    int xy=10;
    printf(mks(Hello world how are you?\n));
    printf("%d\n",concat(x,y));
    printf("\n");
}