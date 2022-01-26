#include<stdio.h>
#include<string.h>

int main()
{
    char str[10];
    gets(str); //gets is dangerous as it does not do any boundary checking - may rewrite other memory locations - vulnerability of hacking - data corruption - use fgets instead
    puts(str);
    printf("\n%d\n",(int)strlen(str));

    /*
    gets_puts.c:(.text+0x28): warning: the `gets' function is dangerous and should not be used.
hello world how are you i am fine
hello world how are you i am fine

33
*** stack smashing detected ***: terminated
[1]    293703 abort (core dumped)  "/home/hari/Desktop/console IO/"gets_puts

*/

//array can hold - 10 char but given 33 characters - stored - but something may get corrupted overwritten.
}