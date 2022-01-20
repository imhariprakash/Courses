#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>


int isfull(int num[],int numElem)
{
    int i;
    for(i=0;i<numElem;i++)  //if 0-9 already came - string - (0 to 9) - not like 11 - since taking only one char - check for space - no space just ignore
    {
        if(num[i]== '\0')
        {
            return 0;
        }
    }
    return 1;
}

int main()
{
    int n,i,flag,num[10],alpha[26],temp;
    char str[100],tempc;
    printf("Enter the string: ");
    scanf("%s",str);

    for(i=0;i<strlen(str);i++)
    {
        flag=1;
        if(isdigit(str[i]))   //takes character
        {
            temp=((int)str[i])-48;  //takes pointer input
            do{
                if(isfull(num,10))
                {
                    break;
                }
                if(num[temp]=='\0')
                {
                    printf("%d",temp);
                    num[temp]=1;
                    flag=0;
                }
                else
                {
                    if(temp==9)
                    {
                        temp=0;
                    }
                    else
                        temp++;
                }
            }while(flag);
        }
        else if(isalpha(str[i]))
        {
            tempc=tolower(str[i]);
            do
            {
                if(isfull(alpha,26))
                {
                    break;
                }
                if(alpha[tempc - 97]== '\0')
                {
                    printf("%c",str[i]);
                    alpha[tempc-97]=1;
                    flag=0;
                }
                else
                {
                    if(tempc=='z')
                    {
                        tempc='a';
                        str[i]-=25;
                    }
                    else
                    {
                        tempc++;
                        str[i]++;
                    }
                }

            }while(flag);
        }
    }
    printf("\n");
    return 0;

}