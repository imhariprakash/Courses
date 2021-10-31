#include<stdio.h>
#include<stdlib.h>

struct Student
{
    char *firstName;
    char *lastName;
    int birthYear;
    double CGPA;
};

printStudent(struct Student stu)
{
    printf("Name : %s %s.\n",stu.firstName,stu.lastName);
    printf("D.O.B: %d\n",stu.birthYear);
    printf("CGPA : %.2lf\n",stu.CGPA);
}

int main()
{
    struct Student me={"Steve","Rogers",1978,4.7};
    printStudent(me);
}
