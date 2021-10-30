#include<stdio.h>
void swap(int *a,int *b)
{
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}
int main()
{
    int i,n;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++){
    printf("Enter the number %d :",i+1);
    scanf("%d",&arr[i]);}
    for(i=0;i<=(n-1)/2;i++)
    swap(&arr[i],&arr[n-1-i]);
    for(i=0;i<n;i++)
    printf("%d ",arr[i]);
    return 0;
}
