#include<stdio.h>
#include<ctype.h>
#include<stdlib.h>
#include<string.h>

void buffer()
{
    char a;
    do{
        a=getc(stdin);
    }while(a!='\n');         //getch,getche are in conio.h - > absent in modern compilers 

    //getch=getche -> use: they doesn't have buffer space - so only takes a single char and return remaining will be cleared.
    //so let's create one
}

int main()
{
    char a;
    do{
        a=getc(stdin);
        buffer();
        printf("%c\n",a);
    }while(a!='.');
}