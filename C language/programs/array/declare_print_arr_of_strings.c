#include<stdio.h>
int main()
{
int i;
char a[5][10]={"Hello","Hi","How","Are","You"};
for(i=0;i<5;i++)
{
printf("%s ",a+i);
}
return 0;
}
