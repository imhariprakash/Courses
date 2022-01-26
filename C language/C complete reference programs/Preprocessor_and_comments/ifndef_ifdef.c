#include<stdio.h>
#include<stdlib.h>

#define TED 10

int main()
{
#ifdef TED
    printf("Hello TED.\n");
#else
    printf("Hi anyone.\n");
#endif

#ifndef RALPH
    printf("Ralph not defined.\n");
#else
    printf("Ralph defined.\n");
#endif
}