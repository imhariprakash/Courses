/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
#include<stdio.h>
using namespace std;
int main()
{
float pi = 3.14, radius, height, CSA;
cout << "\n Curved Surface Area of a cylinder";
cout << "\n Enter Radius (in cm): ";
cin >> radius;
cout << "\n Enter Height (in cm): ";
cin >> height;
CSA = (2*pi*radius)*height;
system("cls");
cout << "\n Radius: " << radius <<"cm";
cout << "\n Height: " << height << "cm";
cout << "\n Curved Surface Area of a Cylinder is " << CSA <<" sq. cm.";
printf("\nHello");
return 0;
}
