#include<stdio.h>
#include<stdlib.h>

int main()
{
    int i,j,k,n,l;
    printf("Enter the number of rows: ");
    scanf("%d",&n);

    for(i=1;i<=n;i++)
    {  
        printf("%d ",i);
        for(j=2,k=n-1,l=k+i;j<=i;j++,k--,l=l+k)
        {
            printf("%d ",l);
        }
        printf("\n");
    }
}