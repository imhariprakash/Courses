/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
using namespace std;
struct employee{
    char name[30];
    int age,salary;
};
int main()
{
    int n,i;
    cout<<"Enter the number of employees: ";
    cin>>n;
    employee em[n];
    cout<<endl<<"Enter the details of "<<n<<"employees."<<endl;
    for(i=0;i<n;i++)
    {
        cout<<endl<<"Enter the details of Employee "<<i+1<<endl;
        cout<<"Enter name: ";
        cin>>em[i].name;
        cout<<endl<<"Enter age: ";
        cin>>em[i].age;
        cout<<endl<<"Enter salary: ";
        cin>>em[i].salary;
    }
    cout<<endl<<"Displaying information."<<endl;
    for(i=0;i<n;i++)
    {
        cout<<"The details of Employee "<<i+1<<endl;
        cout<<"Name: "<<em[i].name<<endl;
        cout<<"Age: "<<em[i].age<<endl;
        cout<<"Salary: "<<em[i].salary<<endl;
    }
}