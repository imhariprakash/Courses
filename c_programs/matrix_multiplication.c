#include<stdio.h>

void get_array(int *arr,int a,int b)
{
    int i,j;
    for(i=0;i<a;i++)
    {
        for(j=0;j<b;j++)
        {
            printf("Enter the element a_%d_%d: ",i+1,j+1);
            scanf("%d",(arr));
            arr+=1;
        }
    }
}

void multiply_matrices(int *arr1,int *arr2,int *arr3,int a,int b,int d)
{
    int i,j,k,sum;
    for(i=0;i<a;i++)
    {
        for(j=0;j<d;j++)
        {
            sum=0;
            for(k=0;k<b;k++)
            {
                sum=sum+(*(arr1+(i*b)+k) * *(arr2+(k*d)+j));
            }
            *(arr3+(i*d)+j)=sum;
        }
    }
}

void print_array(int *arr,int a,int b)
{
    int i,j;
    for(i=0;i<a;i++)
    {
        printf("\n");
        for(j=0;j<b;j++)
        {
            //printf("\nsub array %d and element number %d is %d ",i+1,j+1,*(arr));
            printf("%d ",*arr);
            arr+=1;
        }
    }
    printf("\n");
}

int main()
{
int a,b,c,d;
printf("Number of Rows of matrix A: ");
scanf("%d",&a);
printf("Number of Columns of matrix A: ");
scanf("%d",&b);
int A[a][b];
get_array(A,a,b);
printf("Number of Rows of matrix B: ");
scanf("%d",&c);
printf("Number of Columns of matrix B: ");
scanf("%d",&d);
int B[c][d];
get_array(B,c,d);
printf("\nMatrix A\n");
print_array(A,a,b);
printf("\nMatrix B\n");
print_array(B,c,d);
if(b != c)
{
    printf("\nThe dimensions must be equal in order to multiply two matrices!\n");
    return 0;
}
int C[a][d];
multiply_matrices(A,B,C,a,b,d);
printf("\nMultiplied matrix C\n");
print_array(C,a,d);
return 0;
}
