#include<stdio.h>
#include<stdlib.h>

int main()
{
    int randnum,n;
    randnum=rand();
    printf("Enter the number: ");
    scanf("%d",&n);
    if(n==randnum)
        printf("Correct!\n");
    else
        printf("Wrong! Correct number: %d\n",randnum);
}
    