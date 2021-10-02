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
int radius;
float pi = 3.14;
cout << "\n Enter Radius (in cm): ";
cin >> radius;
float perimeter = (pi+2)*radius; // dynamic initialization
float area = (pi*radius*radius)/2; // dynamic initialization
cout << "\n Perimeter of the semicircle is " << perimeter << " cm";
cout << "\n Area of the semicircle is " << area << " sq.cm";
}
