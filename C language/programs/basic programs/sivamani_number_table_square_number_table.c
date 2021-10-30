#include <stdio.h>

int main()
{
int n,i,j,temp;
printf("Enter the maximum limit-In hundreds: ");
scanf("%d",&n);
printf("\n");
for(i=1;i<=n/10;i++)
{
    temp=i;
    for(j=1;j<=n/10;j++)
    {
        printf("%3d ",temp);
        temp+=10;
    }
    printf("\n");
}
}
