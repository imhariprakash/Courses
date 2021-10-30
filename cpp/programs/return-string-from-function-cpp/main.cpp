/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
using namespace std;
#include<string.h>
char* display(char b[]) //we are going to get array so char *
{
    strcat(b,"agsh");
    return b;           //no need for return as changing b directly changes a.we cant overwrite array.
/* The output is  d       //create a new one *b to collect the output from the function.
                  d       //because for given string d/0 - next line.So we got agsh on next line
                  agsh
*/
}
int main()
{
    char a[10];
    fgets(a,10,stdin);
    char *b=display(a);
    puts(a);
    puts(b);

    return 0;
}
