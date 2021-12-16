#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

int main()
{
    int n,i,j,len;
    char name[50];
    printf("Enter the number of rows: ");
    scanf("%d",&n);
    printf("Enter the name: ");
    scanf("%s",name);
    len=strlen(name);
    printf("\n\n");
    for(i=n/2;i<n;i=i+2)
    {
        for(j=i+2;j<n;j=j+2)           //spaces
        {
            printf("  ");
        }

        for(j=0;j<i;j++)                //stars
        {
            printf("* ");
        }

        for(j=0;j<n-i;j++)          //space
        {
            printf("  ");
        }

        for(j=0;j<i;j++)               //stars
        {
            printf("* ");
        }
        printf("\n");
    }
    if(2*n-1-len >0)
    {
        for(i=0;i<ceil((2*n-1-len)/2);i++)
        {
            printf("* ");
        }
        
        for(i=0;i<len;i++)
        {
            printf("%c ",name[i]);
        }

        for(i=0;i<(2*n-1-len)/2;i++)
        {
            printf("* ");
        }
        printf("\n");
    }

    else
    {
        for(i=0;i<len;i++)
        {
            printf("%c ",name[i]);
        }
    }

    // text -> code for win

    // inverted equilateral triangle
    for(i=1;i<n;i++)
    {
        for(j=0;j<i;j++)
        {
            printf("  ");
        }

        for(j=0;j<(2*(n-i)-1);j++)
        {
            printf("* ");
        }
        printf("\n");
    }
    printf("\n\n");
}