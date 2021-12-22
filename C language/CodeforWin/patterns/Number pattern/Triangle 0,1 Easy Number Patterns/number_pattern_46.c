#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n,i,j,k=1;
    printf("Enter the number of rows: ");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        for(j=0;j<=i;j++)
        {
            if(i%2!=0)
            {
                printf("%d ",i+1-j);
            }
            else
            {
                printf("%d ",j+1);
            }
        }
        printf("\n");
    }

}