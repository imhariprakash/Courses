#include<stdio.h>
void get_array(int *arr,int n)
{
int i;
for(i=0;i<n;i++)
{
printf("Enter the element %d: ",i+1);
scanf("%d",arr+i);
}
}
void thir_max(int *arr,int n)
{
    int Min=-100000;
    int first_max=Min,sec_max=Min,third_max=Min,i;
    for(i=0;i<n;i++)
    {
        if(first_max < *(arr+i))
        {
            third_max=sec_max;
            sec_max=first_max;
            first_max=*(arr+i);
        }
        else if(sec_max < *(arr+i))
        {
            third_max=sec_max;
            sec_max=*(arr+i);
        }
        else if(third_max < *(arr+i))
        {
            third_max=*(arr+i);
        }
    }
    printf("The first maximum value is %d.\n",first_max);
    printf("The second maximum value is %d.\n",sec_max);
    printf("The third maximum value is %d.\n",third_max);
}
int main()
{
int n;
printf("Enter the number of elements: ");
scanf("%d",&n);
int arr[n];
get_array(arr,n);
thir_max(arr,n);
return 0;
}
