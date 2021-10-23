/*
Read problem statements in Mandarin Chinese, Russian, and Vietnamese as well.
You are given two positive integers X and K.

You have to output the minimum and maximum value of LCM(i,j) where X≤i<j≤X⋅K.

We define LCM(i,j) for two positive integers i and j as the minimum positive integer y such that both i and j divide y without remainder.

Input Format
First line will contain T, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, two space separated integers X and K.
Output Format
For each testcase, output two space separated integers - the minimum and maximum possible value respectively of LCM(i,j) where X≤i<j≤X⋅K.

Constraints
1≤T≤105
1≤X≤108
2≤K≤108
It is guaranteed that, for each test case, X⋅K≤109
Sample Input 1
2
4 3
2 3
Sample Output 1
8 132
4 30
Explanation
Test Case 1: We want to find the minimum and maximum value of LCM(i,j) for 4≤i<j≤12. It is easy to verify that the LCM(4,8)=8 is the minimum possible value whereas LCM(11,12)=132 is the maximum value.

Test Case 2: We want to find the minimum and maximum value of LCM(i,j) for 2≤i<j≤6. The maximum value is obtained for the pair (5,6) whereas the minimum is obtained for the pair (2,4).
*/

#include <stdio.h>

int LCM(int a,int b)
{
    int max;
    max=(a>b)?a:b;
    while(1)
    {
        if(max % a ==0 && max % b ==0)
        return(max);
        max++;
    }
}
int main(void) {
	int n,i,a,b,j,min,s;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    scanf("%d %d",&a,&b);
	    b=a*b;
	    min=LCM(a,a+1);
	    for(j=a+2;j<=b;j++)
	    {
	        s=(LCM(a,j));
	        min=(s<min)?s:min;
	    }
	    printf("%d %d\n",min,(b*(b-1)));
	}
	return 0;
}

/*

without function

#include <stdio.h>

int main(void) {
	int n,i,a,b,j,min=1000,s,max;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    scanf("%d %d",&a,&b);
	    b=a*b;
	    for(j=a+1;j<=b;j++)
	    {
	        max=j;
	        while(1)
            {
                if(max % a ==0 && max % j ==0)
                {
                    s=max;
                    break;
                }
                max++;
            }
	        min=(s<min)?s:min;
	    }
	    printf("%d %d\n",min,(b*(b-1)));
	}
	return 0;
}

*/
