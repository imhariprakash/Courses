/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
using namespace std;
int main()
{
int num;
//I am going to store num to the address of temp- meaning now the value of temp is same as that of num
int &temp = num; //declaration of a reference variable temp
num = 100;
cout << "\n The value of num = " << num;
cout << "\n The value of temp = " << temp;
}
/*
The output of the above program will be
The value of num = 100
The value of temp = 100
*/
