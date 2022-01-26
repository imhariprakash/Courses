#include<stdio.h>
#include<stdio.h>

void initialize(int* a,int* b)
{
    *a=0;
    *b=0;
}

int main()
{
    int a,b;
    initialize(&a,&b);
    a=b++ + b++;
    //printf("%d %d\n",a,b);
    initialize(&a,&b);
    a=++b + ++b;
    //printf("%d %d\n",a,b);
    initialize(&a,&b);
    a=b++ + ++b;
    //printf("%d %d\n",a,b);
    initialize(&a,&b);
    a=++b + b++;
    //printf("%d %d\n\n",a,b);
    
    initialize(&a,&b);
    a=b++ + b++ + b++;
    //printf("%d %d\n",a,b);
    initialize(&a,&b);
    a=b++ + b++ + ++b;
    //printf("%d %d\n",a,b);
    initialize(&a,&b);
    a=b++ + ++b + b++;
    //printf("%d %d\n",a,b);
    initialize(&a,&b);
    a=b++ + ++b + ++b;
    //printf("%d %d\n",a,b);
    initialize(&a,&b);
    a=++b + b++ + ++b;
    //printf("%d %d\n",a,b);
    initialize(&a,&b);
    a=++b + ++b + b++;
    //printf("%d %d\n",a,b);
    initialize(&a,&b);
    a=++b + ++b + ++b;
    //printf("%d %d\n",a,b);
    initialize(&a,&b);
    a=++b + b++ + b++;
    printf("%d %d\n",a,b);
}