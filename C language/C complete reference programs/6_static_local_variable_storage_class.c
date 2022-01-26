#include<stdio.h>
#include<stdlib.h>

void sampleFun(int i)
{
    static int a=0;
    a=a+i;
    printf("%d  ",a);
}

int main()
{
    int a,i;
    printf("Enter the number: ");
    scanf("%d",&a);
    for(i=0;i<a;i++)
    {
        sampleFun(i+1);
    }
    printf("\n");
}