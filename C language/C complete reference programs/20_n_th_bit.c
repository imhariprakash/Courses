#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
    int n,a;
    printf("Enter the number: ");
    scanf("%d",&n);
    printf("Enter the bit number: ");
    scanf("%d",&a);
    n=(n>>(a-1))&1;
    if(n)
        printf("%d bit is %d (Set)",a,n);
    else
        printf("%d bit is %d (Unset)",a,n);
}