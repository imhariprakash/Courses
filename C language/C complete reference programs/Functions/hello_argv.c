#include<stdio.h>
#include<stdlib.h>

int main(int argc,char *argv[])
{
    int i;
    if(argc==1)
    {
        printf("You have not given any input at all.\n");
        exit(1);
    }
    for(i=0;i<argc-1;i++)
    {
        printf("Hello %s\n",argv[i+1]);
    }
}