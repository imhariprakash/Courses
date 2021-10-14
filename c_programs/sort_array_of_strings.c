#include<stdio.h>
void get_array(char *a,int n)
{
int i;
for(i=0;i<n;i++)
{
printf("Enter the element %d : ",i+1);
scanf("%s",a);
a+=10;
}
}

void sort_array(char *a,int n)
{
    int i,j,k;
    char *temp;
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-1-i;j++)
        {
            for(k=0;k<10;k++)
            {
                if(a[j][k]>a[j+1][k])
            {
                *temp=*a[j];
                *a[j]=*a[j+1];
                *a[j+1]=*temp;
            }
            }
        }
    }
}

void print_array(char *a,int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("Element number %d is %s\n",i+1,a);
        a+=10;
    }
}
int main()
{
int i,n;
printf("Enter the number of words: ");
scanf("%d",&n);
char a[n][10];
get_array(a,n);
sort_array(a,n);
print_array(a,n);
}
