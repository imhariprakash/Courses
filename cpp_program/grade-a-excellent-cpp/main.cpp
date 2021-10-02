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
char grade;
cout << "\n Enter Grade: ";
cin >> grade;
grade=toupper(grade);
switch(grade)
{
case 'A' : cout << "\n Excellent...";
break;
case 'B' :
case 'C' : cout << "\n Welldone ...";
break;
case 'D' : cout << "\n You passed ...";
break;
case 'E' : cout << "\n Better try again ...";
break;
default : cout << "\n Invalid Grade ...";
}
cout << "\n Your grade is " << grade;
return 0;
}