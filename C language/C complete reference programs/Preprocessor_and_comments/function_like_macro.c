#include<stdio.h>

#define ABS(a)  (a) > 0 ? "Positive":"Negative"

int main()
{
    int n;
    printf("Enter the number: ");
    scanf("%d",&n);
    printf("%s\n",ABS(n));
}