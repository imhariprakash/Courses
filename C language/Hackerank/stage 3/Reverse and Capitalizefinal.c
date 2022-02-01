#include<stdio.h>
#include<stdlib.h>
#include<string.h>

void upper(char array[], int count)
{
    int i;
    for(i=0;i<count;i++)
    {
        if(*(array+i) >= 'a' && *(array+i) <= 'z')
        {
            *(array+i) = *(array+i) - 32;
        }
    }
}

char* getnext(char* array, int limit,int *next, int *flag)  //how many more elements (n-i-1)
{
    for(int i=0;i<limit;i++)
    {
        if((*(array+i) >='a' && *(array+i)<='z') || (*(array+i)>='A' && *(array+i)<='Z'))
        {
            (*flag)++;
            return(array+i);
        }
        else
        {
            (*next)++;
        }
    }
    return (array);
}

void lower(char array[], int count)
{
    int i;
    for(i=0;i<count;i++)
    {
        if(*(array+i) >= 'A' && *(array+i) <= 'Z')
        {
            *(array+i) = *(array+i) + 32;
        }
    }
}

void reverse(char array[], int count)
{
    int i,mid=count/2;
    char temp;
    for(i=0;i<mid;i++)
    {
        temp = *(array+i);
        *(array+i)=*(array+count-i-1);
        *(array+count-i-1)=temp;
    }
}

int main()
{
    int flag=0,count=0,i,n;
    char array[100],*start;//temp;
    scanf("%[a-z ,!?.A-Z]s",array);
    n=strlen(array);
    start=(char*)array;
    for(i=0;array[i]!='\0';i++)
    {
        if(array[i]==' ' || array[i+1]=='\0' || array[i]=='!' || array[i]=='?' || array[i]==',')
        {
            // temp=*(start+count-1);
            // while(temp == '.' || temp == ',' || temp == '?' || temp == ' ')
            // {
            //     count--;
            //      temp=*(start+count-1);
            // }
            if(flag % 2 == 0)
            {
                reverse(start,count);
                lower(start,count);
            }
            else if(flag % 2 == 1)
            {
                upper(start,count);
            }
            start = array+i+1;
            //printf("%d %s\t",i,start);
            start = getnext(start,n-1-i,&i,&flag);
            //printf("%d %s\n",i,start);
            count = 0;
        }
        else if((array[i]>='a' && array[i]<='z') || (array[i]>='A' && array[i]<='Z'))
        {
            count++;
        }
    }
    printf("%s",array);
    
}
