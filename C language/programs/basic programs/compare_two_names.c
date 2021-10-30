#include<stdio.h>
int main()
{
    char a[50],b[50];int i=0;
    printf("Enter a word: ");
    scanf("%s",a);
    printf("\nAnother word: ");
    scanf("%s",b);
    while((a[i]!='\0' && b[i]!='\0')&&a[i]==b[i])
    i++;
    if(a[i]>b[i])
    printf("%s comes first!",b);
    else if(a[i]<b[i])
    printf("%s comes first!",a);
    else
    printf("Same name!");
}
