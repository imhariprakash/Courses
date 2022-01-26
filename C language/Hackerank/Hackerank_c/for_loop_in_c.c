#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

void count(int a)
{
    char* num[9]={"one","two","three","four","five","six","seven","eight","nine"};
    if(a<10 && a>0)
    printf("%s\n",num[a-1]);
    else if(a>9)
    {
        if (a%2==0)
        printf("even\n");
        else
        printf("odd\n");
    }
}




int main() 
{
    int a, b,i;
    scanf("%d\n%d", &a, &b);
    for(i=a;i<=b;i++)
    {
        count(i);
    }
  	

    return 0;
}

