#include<stdio.h>
#include<stdlib.h>
#include<string.h>

char *xgets(char *str,int n)
{
    char *p,ch;
    int i;
    p=str;
    for(i=0;i<n-1;i++)
    {
        ch=getchar();
        if(ch=='\n')
            break;
        else if(ch=='\b')
        {
            if(i>0)
                i--;
            break;
        }
        p[i]=ch;
    }
    p[i]='\0';
    return p;
}

int main()
{
    char str[100],*ptr;
    printf("Enter the string: ");
    ptr=(char*)xgets(str,100);
    printf("\n%s\n",str);
}