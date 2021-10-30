/*
Write a program to Search the elements and print elements between those indexes.

Input Format

8
3 8 7 6 9 1 3 5
8
1

Constraints

Elements should be less than 10

Output Format

7 6 9

Sample Input 0

7
1 2 3 4 5 6 7
3
5
Sample Output 0

4
Explanation 0

key 3 is at the index of 2 and the another key 5 is at the index of 4. So need to print between these indices. So here, we have only 4. So the output will be 4.

*/

#include <stdio.h>
int main()
{
    int n,start,stop,i,ind_stop,ind_start;
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",arr+i);
    }
    scanf("%d %d",&start,&stop);
    for(i=0;i<n;i++)
    {
        if(arr[i]==start)
            ind_start=i;
        if(arr[i]==stop)
            ind_stop=i;
    }
    for(i=ind_start+1;i<ind_stop;i++)
        printf("%d ",arr[i]);
}
