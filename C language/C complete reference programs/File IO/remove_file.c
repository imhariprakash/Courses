#include<stdio.h>
#include<stdlib.h>

int main(int argc, char *argv[])
{
    char ch;
    if(argc < 2){
        printf("Input file not given.\n");
        exit(1);
    }

    printf("Are you sure to delete %s(Y or N): ",argv[0]);
    ch=getchar();
    if(ch == 'y' || ch == 'Y')
    {
        // FILE *file;
        // file=fopen(argv[1],"w+");  //just file name enough no need to open and close
        if(remove(argv[1])){
            printf("File not deleted.\n");
        }
        else
            printf("File successfully deleted.\n");
    }
    else    
        printf("File not deleted.\n");

}