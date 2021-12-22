#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n,i,j,sum=1,var=0;
    printf("Enter the number of rows: ");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        for(j=0;j<=i;j++,var++,sum=sum+var)
        {
            printf("%d ",sum);
        }
        printf("\n");
    }
}