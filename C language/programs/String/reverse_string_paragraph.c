#include<stdio.h>
int main()
{
    int i;
    char a[68][40];
    for(i=0;i<68;i++)
    {
        scanf("%s",&a[i]);
    }
    printf("\n");
    for(i=67;i>=0;i--)
    {
        printf("%s ",a[i]);
    }
    printf("\n");
return 0;
}
