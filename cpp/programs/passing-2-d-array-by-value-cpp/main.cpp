/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
using namespace std;
void display (int n[3][2]);
int main()
{
int num[3][2] = { {3, 4}, {9, 5}, {7, 1} };
display(num);
return 0;
}
void display(int n[3][2])
{
cout << "\n Displaying Values" << endl;
for (int i=0; i<3; i++)
{
for (int j=0; j<2; j++)
{
cout << n[i][j] << " ";
}
cout << endl << endl;
}
}
