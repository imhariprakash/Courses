#include <stdio.h>
#include<math.h>
#include<stdlib.h>

void get_array(int *arr,int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        scanf("%d",arr+i);
    }
}

int ladoos(int *arr,int b)
{
    int i,z,l,j;
    for(i=0;i<log2(b);i++)
	    {
	        z=0;
	        l=b;
	        for(j=0;j<l;j=j+2)
	        {
	            if((abs(arr[j]-arr[j+1]))>1)
	            {
	                printf("NO\n");
	                return 0;
	            }
	            arr[z]=arr[j]+arr[j+1];
	            z++;
	        }
	        l=b/2;
	    }
	    printf("YES\n");
}

int main(void) {
	int n,a,b,k,i,j,z,l;
	scanf("%d",&n);
	for(k=0;k<n;k++)
	{
	    scanf("%d",&a);
	    b=pow(2,a);
	    int arr[b];
	    get_array(arr,b);
	    if(a==0)
	    {
	        printf("YES\n");
	        continue;
	    }
	    ladoos(arr,b);
	}
	return 0;
}
