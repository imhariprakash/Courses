#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
    int i,j,n=4,(*p)[10];
    p=(int(*)[10])malloc(n*10*sizeof(int));
    printf("%ld  ",(long int)p);
    p++;
    printf("%ld\n",(long int)p);
}