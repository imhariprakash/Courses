/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
using namespace std;

struct date_of_birth{
    int date,year;
    char month[3];
};

struct student{
    int age;
    float height,weight;
    date_of_birth dob;
    char name[30];//we can get name directly from the structure itself
};

int main()
{
    int i,n;
    cout<<"Enter the number of students: ";
    cin>>n;
    char st[n][30];//we can get name from a seperate array- 2d,row-no of  names,col-number of letters of a string.
    student stu[n];
    cout<<endl<<"Enter the details of "<<n<<" students.";
    for(i=0;i<n;i++)
    {
      cout<<endl<<"Enter the name: ";
      cin>>st[i];
      cout<<st[i];
      //cin>>stu[i].name;
      cout<<endl<<"Enter the age: ";
      cin>>stu[i].age;
      cout<<endl<<"Enter the height: ";
      cin>>stu[i].height;
      cout<<endl<<"Enter the weight: ";
      cin>>stu[i].weight;
      cout<<endl<<"Enter the date of birth: ";
      cin>>stu[i].dob.date;
      cout<<endl<<"Enter the month of birth: ";
      cin>>stu[i].dob.month;
      cout<<endl<<"Enter the year of birth: ";
      cin>>stu[i].dob.year;
    }
    cout<<endl<<"The values entered for age,height,weight,date,month and year of birth are"<<endl;
    for(i=0;i<n;i++)
    {
     cout<<st[i];
     cout/*<<stu[i].name*/<<":\t"<<stu[i].age<<"\t"<<stu[i].height<<"\t"<<stu[i].weight<<endl;
     cout<<"Date of birth: "<<stu[i].dob.date<<"-"<<stu[i].dob.month<<"-"<<stu[i].dob.year<<endl;
    }
    return 0;
}