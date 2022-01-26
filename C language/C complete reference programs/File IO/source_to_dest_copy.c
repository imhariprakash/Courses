#include<stdio.h>
#include<stdlib.h>

int main(int argc, char *argv[])
{
    FILE *source, *dest;
    char ch;
    source = fopen(argv[1],"r"); //not going to edit
    dest = fopen(argv[2],"w");   //just write - ignore previous version - so delete prev and write new

    if(argc==1)
    {
        printf("No inputs given.\n");
        exit(1);
    }

    else if(argc==2)
    {
        printf("Destination not provided");
        exit(1);
    }

    while(!feof(source))
    {
        ch = getc(source);
        if(!feof(source))    // while will check after printing - i dont need eof so check before printing.
            putc(ch,dest);
    }

    fclose(source);
    fclose(dest);
}