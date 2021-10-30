/*
Read problem statements in Mandarin Chinese and Russian
In order to impress Chefina, Chef is trying to improve his chess calculation skills.

Today, Chef took a big chessboard with N rows (numbered 1 through N) and N columns (numbered 1 through N). Let's denote the square in row r and column c of the chessboard by (r,c). Chef wants to place some queens on this chessboard in such a way that the following conditions are satisfied:

Each square of the board contains at most one queen.
There are exactly N−2 queens on the board.
All squares are reachable by at least one queen.
A queen can reach all cells along the row, column, and diagonals it is placed at.

Formally, a queen placed at square (r,c) can reach square (x,y) if at least one of the following conditions holds:

x=r
y=c
r+c=x+y
r−c=x−y
Help Chef find a possible distribution of queens. If there are multiple solutions, you may find any one. It is guaranteed that under the given constraints, a solution always exists.

Input Format
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.
Output Format
For each test case, print N lines. For each valid i, the i-th of these lines should contain a single string with length N describing row i of the chessboard; for each valid j, the j-th character of this string should be 'Q' if there is a queen in the square (i,j) or '.' if this square is empty. Please note you have to place exactly N−2 queens.

Constraints
1≤T≤100
3≤N≤100
The sum of N2 over all test cases does not exceed 105
Sample Input 1 
2
3
4
Sample Output 1 
...
.Q.
...
...Q
....
.Q..
....
Explanation
Test Case 1: The Queen in the middle covers all squares on the board.

Test Case 2: The Queen at square (1,4) covers all squares in the first row and the last column, while the other Queen covers all the other squares.

*/

#include<stdio.h>

int main() 
{
    int t,k,n,i,j;
    scanf("%d",&t);
    for(k=0;k<t;k++)
    {
        scanf("%d",&n);
        char arr[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]='.';
            }
        }
        arr[n-2][1]='Q';
        for(i=0;i<n-3;i++)
        {
            arr[i][n-1-i]='Q';
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                printf("%c",arr[i][j]);
            }
            printf("\n");
        }
    }
}
