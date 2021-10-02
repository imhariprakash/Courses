/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
#include<stdlib.h>
using namespace std;
int main()
{
    cout<<rand()<<endl;//default seed srand(1) for rand()
    srand(10);  //seeded with 10
    cout<<rand()<<endl;
}
