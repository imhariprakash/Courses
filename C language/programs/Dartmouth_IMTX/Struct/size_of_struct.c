#include <stdio.h>

struct Student
{
	char firstName[5];
	char lastName[5];
	int birthYear;
	double aveGrade;
};

int main()
{
    struct Student me;
    printf("%zu\n",sizeof(struct Student));//24 //though we can use %d, %zu is the preferred one to print sizeof answers!z-length format u-unsigned
    printf("%zu\n",sizeof(me));//24
    printf("%zu\n",sizeof(me.aveGrade));//8
    printf("%zu\n",sizeof(me.firstName));//5
    printf("%zu\n",sizeof(me.lastName));//5
    printf("%zu\n",sizeof(me.birthYear));//4
}
