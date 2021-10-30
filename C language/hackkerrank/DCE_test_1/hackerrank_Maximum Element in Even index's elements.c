/*
Write a program to find the maximum element in even indices's elements.

Input Format

9
4 8 7 6 3 9 2 6 1

Constraints

Elements should be less than 9

Output Format

7

Sample Input 0

5
6 4 5 8 1
Sample Output 0

6
Explanation 0

In Even indices 6,5 and 1 elements are there. In this 6 is the maximum element.

*/

#include <stdio.h>
int main()
{
    int n,i;
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
        scanf("%d",arr+i);
    int max=arr[0];
    for(i=0;i<n;i=i+2)
    {
        if(max < arr[i])
            max=arr[i];
    }
    printf("%d",max);
}
