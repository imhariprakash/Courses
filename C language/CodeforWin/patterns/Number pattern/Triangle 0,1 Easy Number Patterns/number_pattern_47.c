#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
    int n,i,j,k=1;
    printf("Enter the number of rows: ");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        for(j=0;j<=pow(2,i);j++)
        {
           printf("%d ",k);
           k++;
           if(k==10)
              k=1;
        }
        printf("\n");
    }

}