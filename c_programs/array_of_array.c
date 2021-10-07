#include<stdio.h>

void set_to_zero(int **arr)
{
    **arr=0;   //a[0]
    **(arr+1)=0;    //b[0]
    *(*(arr)+1)=0; //a[1]
    *(*(arr)+2)=0;  //a[2]
    *(*(arr+1)+1)=0; //b[1]
    *(*(arr+1)+2)=0; //b[2]
}

int main()
{
int a[3]={1,2,3},b[3]={4,5,6};
int *c[2]={a,b};
set_to_zero(c);
printf("%d %d %d \n%d %d %d",*a,*(a+1),*(a+2),*b,*(b+1),*(b+2));

}

