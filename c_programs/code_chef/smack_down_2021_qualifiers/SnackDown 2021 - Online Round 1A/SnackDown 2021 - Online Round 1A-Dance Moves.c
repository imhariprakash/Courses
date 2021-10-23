/*
Read problem statements in Mandarin Chinese, Russian, and Vietnamese as well.
This year Chef is participating in a Dancing competition. The dance performance will be done on a linear stage marked with integral positions. Initially, Chef is present at position X and Chef's dance partner is at position Y. Chef can perform two kinds of dance moves.

If Chef is currently at position k, Chef can:

Moonwalk to position k+2, or
Slide to position k−1
Chef wants to find the minimum number of moves required to reach his partner. Can you help him find this number?

Input Format
First line will contain a single integer T, the number of testcases. Then the description of T testcases follows.
Each testcase contains a single line with two space-separated integers X,Y, representing the initial positions of Chef and his dance partner, respectively.
Output Format
For each testcase, print in a separate line, a single integer, the minimum number of moves required by Chef to reach his dance partner.

Constraints
1≤T≤103
−103≤X,Y≤103
Sample Input 1
4
3 8
-11 -5
57 492
-677 913
Sample Output 1
4
3
219
795
Explanation
Test Case 1: Chef will perform Moonwalk thrice, followed by a slide reaching at position 8. This makes 4 dance steps in total.
Test Case 2: Performing Moonwalk thrice will take Chef to his dance partner

*/

#include <stdio.h>

int main(void) {
	int n,i,x,y,s;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    s=0;
	    scanf("%d %d",&x,&y);
	    while(x<y)
	    {
	    x=x+2;
	    s+=1;
	    }
	    while(x>y)
	    {
	    x=x-1;
	    s+=1;
	    }
	    printf("%d\n",s);
	}
	return 0;
}
