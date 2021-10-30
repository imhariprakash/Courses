#include <stdio.h>
void swap(char **str1,char **str2)
{
  char *temp = *str1;
  *str1 = *str2;
  *str2 = temp;
}

int main()
{
    char *a="hello",*b="world";
    printf("%s %s\n",a,b);
    swap(&a,&b);
    printf("%s %s",a,b);

    return 0;
}
