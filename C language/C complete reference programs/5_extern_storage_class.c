#include<stdio.h>
#include<stdlib.h>

int main()    
{
    extern int a,b;
    printf("%d %d\n",a,b);
    return 0;
}
 int a=10,b=20;