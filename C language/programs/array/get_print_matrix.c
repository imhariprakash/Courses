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
}

int main()
{
int a,b;
printf("Number of Rows: ");
scanf("%d",&a);
printf("Number of Columns: ");
scanf("%d",&b);
int arr[a][b];
get_array(arr,a,b);
print_array(arr,a,b);
//printf("%d %d %d %d %d %d",arr[0][0],arr[0][1],arr[0][2],arr[1][0],arr[1][1],arr[1][2]);
//printf("\n%d %d %d %d %d %d",&arr[0][0],&arr[0][1],&arr[0][2],&arr[1][0],&arr[1][1],&arr[1][2]);
return 0;
}
