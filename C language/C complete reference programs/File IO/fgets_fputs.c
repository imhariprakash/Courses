#include<stdio.h>
#include<stdlib.h>

int main()
{
    FILE *source,*dest;
    char str[100];
    source=fopen("fgets_fputs_source.txt","r");
    dest=fopen("fgets_fputs_dest.txt","w");

    while(!feof(source)){
        fgets(str,sizeof(str),source);
        if(!feof(source))
        {
            fputs(str,dest);
        }
    }
}