#include<stdio.h>
#include<stdlib.h>

struct employee{
    char name[80];
    int age;
    float wage;
}emp;

int main()
{
    struct employee emp={"Tony",35,234.5};
    struct employee *p=&emp;
    printf("%.2f\n",emp.wage);
    printf("%.2f\n",p->wage);
    printf("%.2f\n",(*p).wage);
}