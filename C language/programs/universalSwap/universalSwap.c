#include<stdio.h>
#include<stdlib.h>
#include<string.h>

void univSwap(void* var1 , void* var2,int size)
{
    char temp[size];
    memcpy(temp,var1,size);
    memcpy(var1,var2,size);
    memcpy(var2,temp,size);
}

int main()
{
    //int a=12,b=18;
    float a=1.2,b=23.3;
    univSwap(&a,&b,sizeof((a)));
    //printf("%d %d\n",a,b);
    printf("%f %f\n",a,b);
}