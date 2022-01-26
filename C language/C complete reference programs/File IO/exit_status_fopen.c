#include<stdio.h>
#include<stdlib.h>

int main()
{
    FILE *file;
    char ch;
    //file=fopen("hello.txt","r");  //15066 segmentation fault (core dumped)  "/home/hari/Desktop/File IO/"fopen_sample
    // since "r" can't create a file - it shows error when file is missing.
    //file=fopen("hello.txt","a+");  // if file missing - one created

    if((file=fopen("hello.txt","a+"))  == NULL){   //if null pointer is returned exit status
        printf("Can't able to open.\n");
        exit(1);
    }
    
    //putc("aa",file);  // "aa" string must be a character
    putc('a',file);  // a is written in the file
    ch=getc(file);
    printf("%d\n",ch);
    fclose(file);
}