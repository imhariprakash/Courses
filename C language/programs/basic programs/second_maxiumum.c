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
void second_min(int *arr,int n)
{
    int first_max=*arr,sec_max=*(arr+1),i;
    if(*arr < *(arr+1))
    {
        sec_max=*arr;
        first_max=*(arr+1);
    }
    for(i=2;i<n;i++)
    {
        if(first_max < *(arr+i))
        {
            sec_max=first_max;
            first_max=*(arr+i);
        }
        else if(sec_max < *(arr+i) && first_max > *(arr+i))
        {
            sec_max=*(arr+i);
        }
    }
    printf("The first maximum value is %d.\n",first_max);
    printf("The second maximum value is %d.\n",sec_max);
}
int main()
{
int n;
printf("Enter the number of elements: ");
scanf("%d",&n);
int arr[n];
get_array(arr,n);
second_min(arr,n);
return 0;
}
