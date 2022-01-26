#include<stdio.h>
#include<stdlib.h>
#include<string.h>

void lower_to_upper(char str[])
{
    int i,n=strlen(str);
    for(i=0;i<n;i++)
    {
        if(str[i]>=97 && str[i]<=122)
        {
            str[i]=(char)((int)str[i]-32);
        }
    }
}

void upper_to_lower(char str[])
{
    int i,n=strlen(str);
    for(i=0;i<n;i++)
    {
        if(str[i]>=65 && str[i]<=90)
        {
            str[i]=(char)((int)str[i]+32);
        }
    }
}

int main()
{
    char str[100];
    printf("Enter the string: ");
    fgets(str,100,stdin);
    lower_to_upper(str);
    printf("%s\n",str);
    upper_to_lower(str);
    printf("%s\n",str);
    return 0;
}

