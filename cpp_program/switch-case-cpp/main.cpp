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
cout << "\n Enter week day number: ";
cin >> num;
switch (num)
{
case 1 : cout << "\n Sunday"; break;
case 2 : cout << "\n Monday"; break;
case 3 : cout << "\n Tuesday"; break;
case 4 : cout << "\n Wednessday"; break;
case 5 : cout << "\n Thursday"; break;
case 6 : cout << "\n Friday"; break;
case 7 : cout << "\n Saturday"; break;
default: cout << "\n Wrong input....";
}
}
