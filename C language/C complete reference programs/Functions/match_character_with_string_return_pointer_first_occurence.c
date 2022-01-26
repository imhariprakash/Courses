#include<stdio.h>
#include<stdlib.h>
#include<string.h>

void *match(char str[],char ch)  //generic pointer
{
    int i,len=strlen(str);
    for(i=0;i<len;i++)
    {
        if(str[i]==ch)
            return(&str[i]);
    }
    return NULL;
}

int main()
{
    char ch,str[100],*ptr;
    printf("Enter the string: ");
    fgets(str,100,stdin);
    printf("Enter the character: ");
    scanf("%c",&ch);
    ptr=(char*)match(str,ch);
    if(!ptr)
        printf("No match found.\n");
    else
        printf("Match found at %d.\n",((int)(ptr-str))+1);
    return 0;
}