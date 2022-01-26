#include<stdio.h>
#include<stdlib.h>

int main()
{
    char str[15];
    FILE *file;
    file=fopen("fseek.txt","w+");
    fputs("Hello world",file);
    fseek(file,3,SEEK_SET);
    fgets(str,15,file);
    printf("%s\n",str);         // lo world ( since pointer moved 3 bytes ahead).
    rewind(file);
    fgets(str,15,file);         // rewind to original position - then print as whole
    printf("%s\n",str);
    return 0;
}