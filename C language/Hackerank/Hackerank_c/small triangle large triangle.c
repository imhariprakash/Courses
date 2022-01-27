#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct triangle
{
	int a;
	int b;
	int c;
};

typedef struct triangle triangle;

float triangleArea(triangle *tr, int n)
{
    float p=(float)(tr[n].a + tr[n].b + tr[n].c)/2.0;
    float result = p*(p - tr[n].a)*(p - tr[n].b)*(p - tr[n].c);
    return(sqrt(result));
}

void swap(triangle *tr, int i, int j)
{
    int temp;
    temp = tr[i].a;
    tr[i].a = tr[j].a;
    tr[j].a = temp;
    temp = tr[i].b;
    tr[i].b = tr[j].b;
    tr[j].b = temp;
    temp = tr[i].c;
    tr[i].c = tr[j].c;
    tr[j].c = temp;    
}

void sort_by_area(triangle* tr, int n) {
	/**
	* Sort an array a of the length n
	*/
    float area1,area2;
    int i,j;
    for(i=0; i < n-1; i++)
    {
        for(j=i+1; j < n; j++)
        {
            area1 = triangleArea(tr,i);
            area2 = triangleArea(tr,j);
            if(area1 > area2)
            {
                swap(tr,i,j);
            }
        }
    }
    
}

int main()
{
	int n;
	scanf("%d", &n);
	triangle *tr = malloc(n * sizeof(triangle));
	for (int i = 0; i < n; i++) {
		scanf("%d%d%d", &tr[i].a, &tr[i].b, &tr[i].c);
	}
	sort_by_area(tr, n);
	for (int i = 0; i < n; i++) {
		printf("%d %d %d\n", tr[i].a, tr[i].b, tr[i].c);
	}
	return 0;
}


/*
30
67 38 58
57 32 46
61 70 70
29 27 27
59 41 33
45 50 11
59 56 59
29 59 51
68 53 53
70 70 5
22 58 52
44 6 41
53 58 61
4 57 54
22 26 13
67 27 66
52 58 19
50 36 58
29 61 39
55 57 18
51 12 47
24 70 67
12 26 24
14 54 53
29 34 56
29 36 57
13 2 12
55 20 55
49 36 46
63 58 41

*/