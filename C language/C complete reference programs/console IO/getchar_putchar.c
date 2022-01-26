#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>

int main()
{
    int n;
    char a;

    printf("Line buffered input\n\n");
    a=getchar();         //abc - a will be used by getchar and b c will be used by the getchar inside de while for two loops - waiting for ip after that
    putchar(a);

    printf("\n\nEnter (.) to quit.\n\n");
    do{
        a=getchar();
        a=toupper(a);
        putchar(a);
    }while(a!='.');
}