#include<stdio.h>
int main()
{
    int n,num,i;
    printf("Enter the number of Elements: ");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        printf("Enter the element number %d : ",i+1);
        scanf("%d",&arr[i]);
    }
    printf("Enter the element to search: ");
    scanf("%d",&num);
    for(i=0;i<n;i++){
        if(num==arr[i])
            printf("Element \"%d\" found at index %d.\n",num,i);
    }

    return 0;
}
