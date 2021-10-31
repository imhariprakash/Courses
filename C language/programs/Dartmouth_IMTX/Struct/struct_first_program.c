#include<stdio.h>
#include<stdlib.h>

struct Student
{
    char *firstName;
    char *lastName;
    int birthYear;
    double CGPA;
};

int main()
{
    struct Student me={"Steve","Rogers",1978,4.7};
    printf("First name: %s.\n",me.firstName);
    printf("Last name: %s.\n",me.lastName);
    printf("Birth year: %d\n",me.birthYear);
    printf("CGPA: %.2lf\n",me.CGPA);
}
