#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n,i,j,k=1,temp;
    printf("Enter the number of rows: ");
    scanf("%d",&n);

    for(i=1;i<=n;i++)
    {
        if(i%2!=0)
        {
            for(j=1;j<=i;j++,k++)
            {
                printf("%d ",k);
            }
        }
        else
        {
            temp=k;
            for(j=k+i-1;j>=temp;j--,k++)
            {
                printf("%d ",j);
            }
        }
        printf("\n");
    }

        
    }