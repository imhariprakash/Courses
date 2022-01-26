#include<stdio.h>
#include<stdlib.h>

int main(int argc,char *argv[])
{
    printf("%d\n",argc);
    if(argc != 2)
    {
        printf("You forgot to enter your name!\n");
        exit(1);
    }
    else
    {
        printf("Hello %s\n",argv[1]);
        return 0;
    }
}