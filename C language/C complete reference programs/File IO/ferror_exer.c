#include<stdio.h>
#include<stdlib.h>

#define IN 0
#define OUT 1

void err(int e)
{
    if(e)
        printf("Error reading the output file.\n");
    else
        printf("Error reading the input file.\n");
    exit(1);
}


int main(int argc, char *argv[])
{
    char ch;
    if(argc != 3){
        printf("Format is wrong!\n");
        printf("Enter in the format file <IN> <OUT>\n"); //ferror_exer_source.txt ferror_exer_dist.txt
        exit(1);
    }
    FILE *source,*dest;
    if((source=fopen(argv[1],"r"))==NULL)
    {
        printf("Can't able to open source file.\n");
        exit(1);
    }
    if((dest=fopen(argv[2],"w"))==NULL)
    {
        printf("Can't able to open destination file.\n");
        exit(1);
    }
    
    do{
        ch=getc(source);
        if(ferror(source))
            err(IN);
        if(ch=='\t')
        {
            for(int i=0;i<4;i++)
            {
                putc(' ',dest);
            }
            if(ferror(dest))
                err(OUT);
        }
        else{
            if(!feof(source))
                putc(ch,dest);
            if(ferror(dest))
                err(OUT);
        }
    }while(!feof(source));

    fclose(source);
    fclose(dest);

}