#include<stdio.h>
void get_array(char *a,int n)
{
int i;
for(i=0;i<n;i++)
{
printf("Enter the element %d : ",i+1);
scanf(" %c",a);
a++;
}
}

void sort_array(char *a,int n)
{
    int i,j;
    char temp;
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-1-i;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
}

void print_array(char *a,int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("Element number %d is %c\n",i+1,*(a+i));
    }
}
int main()
{
int i,n;
printf("Enter the number of elements: ");
scanf("%d",&n);
char a[n];
get_array(a,n);
sort_array(a,n);
print_array(a,n);
}
