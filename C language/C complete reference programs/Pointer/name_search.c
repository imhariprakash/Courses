#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int searchName(char name[], char* names[])
{
    int i;
    for(i=0;names[i];i++)
    {
        if(strcmp(names[i],name)==0)
        {
            return i;
        }
    }
    return -1;
}

int main()
{
    char name[100];
    int index;
    char* names[]={"jadon","roy","abi","tim","yusuf","jane","flash","raj","rob","ram",NULL};
    printf("Enter the name: ");
    scanf("%s",name);
    index=searchName(name,names);
    if(index!=-1)
    {
        printf("Matching at index %d.\n",index);
    }
    else
    {
        printf("No matches found.\n");
    }
}