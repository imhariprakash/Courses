#include <iostream>
#include <stdlib.h>
  
using namespace std;
  
// required structure
struct Employee {
    int Id;
    string Name;
};
  
// return type of the function is structure
Employee data(Employee E)
{
  
    // Assigning the values to elements
    E.Id = 45;
    E.Name = "aman";
  
    // returning structure
    return (E);
}
  
// Driver code
int main()
{
  
    // creating object of Employee
    Employee Emp;
  
    // calling function data to assign value
    Emp = data(Emp);
  
    // display the output
    cout << "Employee Id: " << Emp.Id;
    cout << "\nEmployee Name: " << Emp.Name;
  
    return 0;
}