#include<stdio.h>
#include<stdlib.h>

int main()
{
    float a=1234;
    int b=10,width,preci;
    printf("Printed with decimal point even no decimal point: %#g  %#G  %#e  %#E \nPrinted normally: %g  %G  %e  %E  \nPrinted with zero prefix: %#x  %#X  %#o\n",a,a,a,(double)10000000,a,a,a,(double)10000000,b,b,b);
    printf("\nEnter the width: ");
    scanf("%d",&width);
    printf("Enter the precision: ");
    scanf("%d",&preci);
    printf("%*.*f\n",width,preci,1234.12344356543);
}