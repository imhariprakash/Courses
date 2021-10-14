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
void thir_min(int *arr,int n)
{
    int MAX=100000;
    int first_min=MAX,sec_min=MAX,third_min=MAX,i;
    for(i=0;i<n;i++)
    {
        if(first_min > *(arr+i))
        {
            third_min=sec_min;
            sec_min=first_min;
            first_min=*(arr+i);
        }
        else if(sec_min > *(arr+i))
        {
            third_min=sec_min;
            sec_min=*(arr+i);
        }
        else if(third_min > *(arr+i))
        {
            third_min=*(arr+i);
        }
    }
    printf("The first minimum value is %d.\n",first_min);
    printf("The second minimum value is %d.\n",sec_min);
    printf("The third minimum value is %d.\n",third_min);
}
int main()
{
int n;
printf("Enter the number of elements: ");
scanf("%d",&n);
int arr[n];
get_array(arr,n);
thir_min(arr,n);
return 0;
}
