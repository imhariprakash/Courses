#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int count=0,perm;
int permutation(int n)
{
    if(n==1)
    return 1;
    else
    return(n*permutation(n-1));
}

int next_permutation(int n, char **s)
{
    char *temp;
    int i;
    if(count==0)
    {
        perm=permutation(n);
    }
    count=count+1;
    for (i=0;i<n-1;i++)
    {
        if(s[i]==s[n-1]);
        temp=s[i];
        s[i]=s[n-1];
        s[n-1]=temp;
    }
    if(count==perm)
    return 0;
    else
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