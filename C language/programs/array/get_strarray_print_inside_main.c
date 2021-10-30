#include<stdio.h>
int main()
{
int i,n;
printf("Enter the number of words: ");
scanf("%d",&n);
char a[n][10];
for(i=0;i<n;i++)
{
printf("Enter the word number %d: ",i+1);
scanf("%s",a+i);
}
for(i=0;i<n;i++)
{
printf("%s ",a+i);
}
return 0;
}
