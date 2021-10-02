/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
using namespace std;
struct Employee
{
char name[50];
int age;
float salary;
};
void printData(Employee); // Function declaration
int main()
{
Employee p;
cout<< "Enter Full name: ";
cin>>p.name;
cout<< "Enter age: ";
cin>>p.age;
cout<< "Enter salary: ";
cin>>p.salary;
// Function call with structure variable as an argument
printData(p);
return 0;
}
void printData(Employee q)
{
cout<< "\nDisplaying Information." <<endl;
cout<< "Name: " << q.name <<endl;
cout<<"Age: " <<q.age<<endl;
cout<< "Salary: " <<q.salary;
}
