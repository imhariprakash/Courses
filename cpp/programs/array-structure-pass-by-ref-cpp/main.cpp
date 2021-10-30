/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
using namespace std;
struct Employee {
char name[50];
int age;
float salary;
};
void readData(Employee &);  //pre decalring of function diplay(int,int)
void printData(Employee);
int main()
{
    Employee p;
    readData(p);
printData(p);
return 0;
}
void readData(Employee &p) {
cout<< "Enter Full name: ";
cin.get(p.name, 50);
cout<< "Enter age: ";
cin>>p.age;
cout<< "Enter salary: ";
cin>>p.salary;
}
void printData(Employee p)
{
cout<< "\nDisplaying Information." <<endl;
cout<< "Name: " << p.name <<endl;
cout<<"Age: " <<p.age<<endl;
cout<< "Salary: " <<p.salary;
}
