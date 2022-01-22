#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
    int num,i;
    char ch;
    printf("enter the string: ");
    while(1)
    {
        scanf("%c",&ch);
        if(ch == '\n')
            break;
        scanf("%d",&num);
        for(i=0;i<num;i++)
            printf("%c",ch);
    }
    printf("\n");
}