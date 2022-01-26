#include<stdio.h>
#include<stdlib.h>

int main()
{
    FILE *file;
    char ch;
    file=fopen("get_input_write_file.txt","w+");
    printf("\n\t\tTo end writing enter dollar symbol.\n\n");
    do{
        ch=getchar();
        if(ch != '$')
            putc(ch,file);
    }while(ch != '$');
}

/*  input

abcdefghijklmnopqrstuvwxyzabcd
efghijkl
sdf$

*/