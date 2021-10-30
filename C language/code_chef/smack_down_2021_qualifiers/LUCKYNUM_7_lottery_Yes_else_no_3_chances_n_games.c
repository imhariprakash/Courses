/*
Read problem statements in Mandarin Chinese, Russian, and Vietnamese as well.
Chef buys a lottery ticket that has a 3 digit code associated with it. He thinks that digit 7 is his lucky digit and brings him good luck. Chef will win some amount in the lottery if at least one of the digits of the lottery ticket is 7.

Given three digits A, B, and C of the lottery ticket, tell whether Chef wins something or not?

Input Format
First line will contain T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, three space separated integers A,B,C.
Output Format
For each testcase, output in a single line answer "YES" if Chef wins a positive amount with the lottery and "NO" if not.

You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

Constraints
1≤T≤1000
0≤A,B,C≤9
Sample Input 1
3
0 0 0
7 8 9
2 7 7
Sample Output 1
NO
YES
YES
Explanation
Test Case 1: Since no digit is equal to 7, Chef fails to win any amount in the lottery.

Test Case 2: Since the first digit is equal to 7, Chef will win some amount in the lottery.

Test Case 3: Since the second and third digit is equal to 7, Chef will win some amount in the lottery.

*/

#include <stdio.h>

int main(void) {
    int n,i,j,a,flag;
    scanf("%d",&n);
    for(j=0;j<n;j++)
    {
    flag=0;
    for(i=0;i<3;i++)
    {
        scanf("%d",&a);
        if(a==7)
        flag+=1;
    }
    if(flag >0)
    printf("YES\n");
    else
    printf("NO\n");
    }
}
