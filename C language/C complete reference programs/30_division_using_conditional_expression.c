#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int dividend,divisor,quotient=-1,reminder=-1;
    printf("Enter the dividend: ");
    scanf("%d",&dividend);
    printf("Enter the divisor: ");
    scanf("%d",&divisor);
    divisor !=0 ?  quotient=dividend / divisor , reminder=dividend % divisor : printf("Divisor can't be as zero!\n");
    printf("Quotient: %d\nRemainder: %d",quotient,reminder);
}