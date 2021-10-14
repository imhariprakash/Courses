/*
Need to write a program print the array as given input.

Input Format

6
5 6 4 3 8 9

Constraints

1<=n<=20

Output Format

5 6 4 3 8 9

Sample Input 0

5
9 8 6 5 7
Sample Output 0

9 8 6 5 7

*/

#include <stdio.h>
int main()
{
    int n,i;
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++){
        scanf("%d",arr+i);
        printf("%d ",arr[i]);}
}
