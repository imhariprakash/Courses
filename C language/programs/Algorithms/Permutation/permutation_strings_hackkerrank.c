#include <stdio.h>
#include <stdlib.h>
#include <string.h>



int getk(char* array[],int n)
{
    int k=-1;
    for(int i=0;i<n-1;i++)
    {
        if(strcmp(array[i+1],array[i]) > 0)      
        {
            k=i;
        }
    }
    return k;
}


int getl(char* array[],int n,int k)
{
    int i,l=0;
    for(i=0;i<n;i++)
    {
        if(strcmp(array[i],array[k]) > 0)         
        {
            l=i;
        }
    }
    return l;
}


void swap(char** a, char** b)
{
    char* temp;
    temp=*a;     //address of a is copied to temp -> b to a -> temp to b
    *a=*b;
    *b=temp;
}


void reverse_array(char* array[], int start, int end)
{
    int middle;
    middle=((end + start)/2);
    for(int i=start;i<=middle;i++)
    {
        swap(&array[i],&array[end]);
        end--;
    }
}


int next_permutation(int n, char *array[])
{
	/**
	* Complete this method
	* Return 0 when there is no next permutation and 1 otherwise
	* Modify array s to its next permutation
	*/
    int k,l;
    k = getk(array,n);                         
    if(k == -1)
    {
        return 0;
    }
    l = getl(array,n,k);                      
    swap(&array[k],&array[l]);   
    reverse_array(array,k+1,n-1); 
    return 1;            
}

int main()
{
	char **s;
	int n;
	scanf("%d", &n);
	s = calloc(n, sizeof(char*));
	for (int i = 0; i < n; i++)
	{
		s[i] = calloc(11, sizeof(char));
		scanf("%s", s[i]);
	}
	do
	{
		for (int i = 0; i < n; i++)
			printf("%s%c", s[i], i == n - 1 ? '\n' : ' ');
	} while (next_permutation(n, s));
	for (int i = 0; i < n; i++)
		free(s[i]);
	free(s);
	return 0;
}