/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
# include <iostream>
using namespace std;
int main()
{
float num, average, sum = 0.0;
int i, n;
cout<< "Maximum number of inputs: ";
cin>> n;
for(i = 1; i<= n; ++i)
{
cout<< "Enter n" <<i<< ": ";
cin>>num;
if(num< 0.0)
{
// Control of the program move to jump:
goto jump;
}
sum += num;
}
jump:
average = sum / (i - 1);
cout<< "\nAverage = " << average;
return 0;
}
