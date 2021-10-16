#include<stdio.h>

void multiply_matrices(int *ans,int *A,int a,int b,int d)
{
    int i,j,k,sum,B[2][2];
    for(i=0;i<a;i++)
    {
        for(j=0;j<d;j++)
        {
            sum=0;
            for(k=0;k<b;k++)
            {
                sum=sum+(*(ans+(i*b)+k) * *(A+(k*d)+j)); //using an extra array -> any alteration in between will corrupt the ans matrix. We need to do multiplication using old matrix.
            }
            B[i][j]=sum; //The temporary array stores the multiplication result to finally update the ans matrix
        }
    }
    for(i=0;i<a;i++)
    {
        for(j=0;j<d;j++)
        {
            *(ans+(i*d)+j)=B[i][j];
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
            printf("%d ",*arr);
            arr+=1;
        }
    }
    printf("\n");
}

int main()
{
int n,i,A[2][2]={{1,1},{1,0}},ans[2][2]={{1,1},{1,0}}; //caution : assign fully [2][2] -> else the answer is getting wrong!
printf("Enter n: ");
scanf("%d",&n);
if(n==0){
    printf("The element 0 is 0.");
    return 0;
}
for(i=1;i<n;i++)
{
multiply_matrices(ans,A,2,2,2);
}
printf("The element %d is %d.",n,ans[0][1]);
return 0;
}
