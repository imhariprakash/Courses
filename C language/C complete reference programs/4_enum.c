#include<stdio.h>
#include<stdlib.h>

enum color {black,brown,red,orange,yellow=2,green,blue,violet,grey,white}; //with tag
enum{open=1,closed=0}; //without tag
int main()
{
    printf("%d %d %d %d %d %d %d %d %d %d\n",black,brown,red,orange,yellow,green,blue,violet,grey,white);
    printf("%d %d\n",open,closed);
}