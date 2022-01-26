#include<stdio.h>
#include<stdlib.h>

int main()
{
    double a=1;
    int i;
    for(i=0;i<10;i++)
    {
        printf("%e ",a);
        a=a*10;
    }
    printf("\n");
    a=1;
    for(i=0;i<10;i++)
    {
        printf("%g ",a);
        a=a*10;
    }
    
    printf("\nOctal : %o \nHexa: %x\n",111,111);
}