#include<stdio.h>
struct Student
{
    char name[30];
    char branch[30];
    int year;
    int dob;
    double cgpa;
};

void get_details(struct Student *stu)
{
    printf("Enter the name: ");
    scanf("%s", stu->name);
    printf("Enter the department: ");
    scanf("%s", stu->branch);
    printf("Enter the year: ");
    scanf("%d",&stu->year);
    printf("Enter the year of birth: ");
    scanf("%d",&stu->dob);
    printf("Enter the CGPA: ");
    scanf("%lf",&stu->cgpa);
}

void print_details(struct Student stu)
{
    printf("Name: %s\n",stu.name);
    printf("Department: %s\n",stu.branch);
    printf("Year of study: %d\n",stu.year);
    printf("Birth year: %d\n",stu.dob);
    printf("CGPA: %.2lf\n",stu.cgpa);
}
int main()
{
    struct Student student1;
    get_details(&student1);
    print_details(student1);
}


