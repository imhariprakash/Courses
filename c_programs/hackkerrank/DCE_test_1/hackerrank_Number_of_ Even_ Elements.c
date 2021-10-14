/*
Write a program to find out number of even elements in the given array.

Input Format

7
7 6 8 4 3 5 9

Constraints

Elements should be less than 10

Output Format

3

Sample Input 0

6
8 6 4 10 2 68
Sample Output 0

6

*/

#include <stdio.h>
int main()
{
    int n,count=0,i;
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",arr+i);
        if(arr[i]%2==0)
            count++;
    }
    printf("%d",count);
}
