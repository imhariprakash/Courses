#include<stdio.h>

void print(int n)
{
    char* num[9]={"one","two","three","four","five","six","seven","eight","nine"};
    if(n<10 && n>0)
    printf("%s",num[n-1]);
    if(n>9)
    printf("Greater than 9");    
}

int main()
{
    int n;
    scanf("%d",&n);
    print(n);
    return 0;
}
