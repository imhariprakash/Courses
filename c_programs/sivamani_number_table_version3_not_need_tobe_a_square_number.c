#include <stdio.h>
#include<math.h>
int main()
{
int n,i,j,temp;
printf("Enter the number(must be a perfect square number - else the op won't be square!): ");
scanf("%d",&n);
printf("\n");
for(i=1;i<=n/(int)sqrt(n);i++)
{

    for(j=i;j<=n;j=j+n/(int)sqrt(n))
    {
        printf("%3d ",j);
    }
    printf("\n");
}
}
