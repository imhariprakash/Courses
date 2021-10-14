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
    int first_min=*arr,sec_min=*(arr+1),third_min=*(arr+2),i;
    if(*arr < *(arr+1) && *arr < *(arr+2) && *(arr+1) > *(arr+2))
    {
        first_min=*arr;
        sec_min=*(arr+2);
        third_min=*(arr+1);
    }
    else if(*(arr+1) < *arr && *(arr+1) < *(arr+2) && *arr < *(arr+2))
    {
        first_min=*(arr+1);
        sec_min=*arr;
        third_min=*(arr+2);
    }
    else if(*(arr+1) < *arr && *(arr+1) < *(arr+2) && *arr > *(arr+2))
    {
        first_min=*(arr+1);
        sec_min=*(arr+2);
        third_min=*arr;
    }
    else if(*(arr+2) < *arr && *(arr+2) < *(arr+1) && *arr < *(arr+1))
    {
        first_min=*(arr+2);
        sec_min=*arr;
        third_min=*(arr+1);
    }
    else if(*(arr+2) < *arr && *(arr+2) < *(arr+1) && *arr > *(arr+1))
    {
        first_min=*(arr+2);
        sec_min=*(arr+1);
        third_min=*arr;
    }
    for(i=3;i<n;i++)
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
