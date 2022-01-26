#include<stdio.h>
#include<stdlib.h>

int main()
{
    //binary file - so can't able to read opening file - some format -  not english - open from 
    // c - fread

    int i=10,a;
    double j=10.20348,b;
    char k='a',c;
    long l=1234321L,d;

    FILE *file;
    if((file=fopen("fread_fwrite.txt","w+"))==NULL){
        printf("Can't open the file to write.\n");
        exit(1);
    }

    fwrite(&i,sizeof(i),1,file);
    fwrite(&j,sizeof(j),1,file);
    fwrite(&k,sizeof(k),1,file);
    fwrite(&l,sizeof(l),1,file);

    fflush(file);
    rewind(file);

    fread(&a,sizeof(int),1,file);
    fread(&b,sizeof(double),1,file);
    fread(&c,sizeof(char),1,file);
    fread(&d,sizeof(long),1,file);

    printf("%d  %lf  %c  %ld\n",a,b,c,d);

    return 0;

}