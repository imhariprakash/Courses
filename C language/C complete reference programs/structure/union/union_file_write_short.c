#include<stdio.h>
#include<stdlib.h>


union pw{
    short int i;
    char ch[2];
}word;

int putk(short int num, FILE *fp)   //putw  - already a function is there in putc
{
    union pw word;
    word.i=num;
    putc((int)word.ch[0],fp);
    return(putc((int)word.ch[1],fp));
}

int main()
{
    FILE *fp;
    fp=fopen("hello.tmp","wb+");
    if(fp == NULL)
    {
        printf("Cannot open file.\n");
        exit(1);
    }
    putk(1025,fp);
    fclose(fp);

    return 0;
}