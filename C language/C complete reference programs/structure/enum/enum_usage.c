#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef enum {penny,nickel,dime,quarter=100,half_dollar,dollar}coins;

int main()
{
    coins money;
    printf("%d %d %d %d %d %d\n",penny,nickel,dime,quarter,half_dollar,dollar);

                                                 /*error*/
    // money=dollar;
    // printf("%s\n",money); //money is an unsigned int since its going to hold any variables(enum) it holds in declaration

                                                /*error*/
    strcpy(money,"dollar");


    /*
    tempCodeRunnerFile.c:17:12: error: incompatible type for argument 1 of ‘strcpy’
   17 |     strcpy(money,"dollar");
      |            ^~~~~
      |            |
      |            coins {aka enum <anonymous>}
In file included from tempCodeRunnerFile.c:3:
/usr/include/string.h:122:14: note: expected ‘char * restrict’ but argument is of type ‘coins’ {aka ‘enum <anonymous>’}
  122 | extern char *strcpy (char *__restrict __dest, const char *__restrict __src)

  */

}