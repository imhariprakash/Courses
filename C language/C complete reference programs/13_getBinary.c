#include<stdio.h>
#include<stdlib.h>
#define INDEX sizeof(int)*8  //4 bytes = 32 bits

int main()
{
    int n,bin[INDEX],index,i,j;
    printf("Enter the number : ");
    scanf("%d",&n);
    index=INDEX-1;

    while(index>=0)
    {
        bin[index]=(n & 1);
        index--;
        n=n>>1;
    }

    for(j=0;j<INDEX;j++)
    {
        if(bin[j]==1)
        {
            break;
        }
    }

    for(i=j;i<INDEX;i++)
        printf("%d",bin[i]);

    printf("\n");

    return 0;
}
