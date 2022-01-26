#include<stdio.h>
#include<stdlib.h>
#include<string.h>
  
//not gonna work - using pointers- need to be initialized before using - without address - fgets can't able to write  - core dumped

typedef struct{
    char *name;
    char *department;
    char *rollnum; 
    char *dob;
    int year;
}student;

int main()
{
    student student1={"Hari","ECE","19ECE104","18.05.2002",3},student2;
    printf("%s %s %s %d %s\n",student1.name,student1.department,student1.rollnum,student1.year,student1.dob);
    printf("Enter your name: ");
    fgets(student2.name,100,stdin);
    printf("Enter your department: ");
    fgets(student2.department,100,stdin);
    printf("Enter your roll number: ");
    fgets(student2.rollnum,100,stdin);
    printf("Enter your year of study: ");
    scanf("%d",&student2.year);
    getchar();  //getchar() is used since scanf leaves \n which is read by fgets() that makes it useless since it wont read further. getchar() takes that \n and makes the job done
    //https://www.geeksforgeeks.org/problem-with-using-fgets-gets-scanf-after-scanf-in-c/#:~:text=Explanation%3A+The+problem+with+the,is+used+in+a+loop.
    printf("Enter your dob: ");
    fgets(student2.dob,100,stdin);
    printf("\n%s%s%s%d\n%s\n",student2.name,student2.department,student2.rollnum,student2.year,student2.dob);
}

