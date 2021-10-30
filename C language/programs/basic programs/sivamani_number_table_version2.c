#include <stdio.h>

int main()
{
int n,i,j,temp;
printf("Enter the maximum limit-In hundreds: ");
scanf("%d",&n);
printf("\n");
for(i=1;i<=10;i++)
{

    for(j=i;j<=n;j=j+10)
    {
        printf("%3d ",j);
      //  temp+=10;
    }
    printf("\n");
}
}

