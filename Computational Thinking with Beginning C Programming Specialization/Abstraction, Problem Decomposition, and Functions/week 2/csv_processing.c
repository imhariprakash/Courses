#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main()
{
    char my_string[100],my_x[100],my_y[100];
    int i=0;
    fgets(my_string,sizeof(my_string),stdin);
    while(my_string[i]!=',' && my_string[i] !='\0')
    {
        i++;
    }
    strncpy(my_x,my_string,i);
    strncpy(my_y,my_string+i+1,sizeof(my_string)-i-1);
    //printf("%s\n%s",my_x,my_y);
    float c=atof(my_x);
    float d=atof(my_y);
    printf("X value: %.2f\nY value: %.2f\n",c,d);
}
