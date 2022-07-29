#include <stdio.h>
#include <stdlib.h>

struct Farm
{
    int hens;
    int cows;
};

int maxLegs(struct Farm farms[], int m)
{
    int i, j, max = 0;
    for (i = 0; i < m; i++)
    {
        int legs = farms[i].hens * 2 + farms[i].cows * 4;
        if (legs > max)
        {
            max = legs;
        }
    }
    return max;
}

int main()
{
    int n;
    scanf("%d", &n);
    struct Farm farms[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d %d", &farms[i].hens, &farms[i].cows);
    }
    printf("%d\n", maxLegs(farms, n));
}