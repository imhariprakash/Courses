#include<stdio.h>
#include<stdlib.h>

int main(int argc, char *argv[])  //first argument file name(object file)
{
    FILE *file;
    char ch;

    if(argc==1) {
        printf("File not given as input.\n");
        exit(1);
    }

    file=fopen(argv[1],"r");
    int a=0;
    printf("%s\n",argv[1]);
    do{
        ch=getc(file);
        if(ch != EOF)
            putchar(ch);
        a++;
    }while(ch != EOF);

    printf("\ncharacters read: %d\n",a);
}

/*
gcc textReader.c -o textReader -Wall
./textReader textReader.txt
*/