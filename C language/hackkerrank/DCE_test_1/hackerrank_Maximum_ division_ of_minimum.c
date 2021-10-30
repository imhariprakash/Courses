/*
Write a program to find maximum and minimum elements from the given array. Print the division of max with min value.

Input Format

6
3 2 4 5 7 6

Constraints

All should be numbers

Output Format

3

Sample Input 0

5
8 7 3 2 9
Sample Output 0

4
Explanation 0

Maximum Element: 9 Minimum Element: 2 Result = 9/2 = 4

*/

#include <stdio.h>
int main()
{
    int n,min,max,i;
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",arr+i);
    }
    min=arr[0];
    max=arr[0];
    for(i=1;i<n;i++)
    {
        if(arr[i]<min)
            min=arr[i];
        if(arr[i]>max)
            max=arr[i];
    }
    printf("%d",max/min);
    return 0;
}
