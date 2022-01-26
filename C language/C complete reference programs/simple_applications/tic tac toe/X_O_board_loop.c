#include<stdio.h>

int main()
{
    int i,j,size=3;
    for(i=0;i<size;i++)
    {
        printf("\n");
        for(j=0;j<size;j++)
        {
            printf(" ___ ");
        }
        printf("\n");
        for(j=0;j<size;j++)
        {
            printf("| %c |",'X');
        }
        printf("\n");
        for(j=0;j<size;j++)
        {
            printf("|___|");
        }
        }
    printf("\n\n");
}