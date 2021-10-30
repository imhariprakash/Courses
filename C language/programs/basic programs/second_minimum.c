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
    int first_min=*arr,sec_min=*(arr+1),i;
    if(*arr > *(arr+1))
    {
        sec_min=*arr;
        first_min=*(arr+1);
    }
    for(i=2;i<n;i++)
    {
        if(first_min > *(arr+i))
        {
            sec_min=first_min;
            first_min=*(arr+i);
        }
        else if(sec_min > *(arr+i) && first_min < *(arr+i))
        {
            sec_min=*(arr+i);
        }
    }
    printf("The first minimum value is %d.\n",first_min);
    printf("The second minimum value is %d.\n",sec_min);
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
