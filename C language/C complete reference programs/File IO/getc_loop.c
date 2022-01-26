#include<stdio.h>
#include<stdlib.h>

int main()
{
    FILE *file;
    char ch;
    file=fopen("getc_loop.txt","a+"); 
    
    do{
        ch=getc(file);
        if(ch != '\n' && ch != EOF)
            printf("%c ",ch); //EOF also printed and \n too
    }while(ch != EOF);
    printf("\n");
    fclose(file);
}