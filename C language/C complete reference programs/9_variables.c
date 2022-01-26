#include<stdio.h>
#include<stdlib.h>

int main()
{
    int hex=0x80a,oct=012;
    long int a=123L;
    float b=12.12f;
    printf("%d  %d  %lu  %f\b\f\r\a",hex,oct,a,b);
    printf("G\n");
    printf("%x %o  %lx %lo\n",hex,oct,a,a);
}