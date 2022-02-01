#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int test(int array[],int n)
{
    int i;
    for(i=0;i<n-1;i++)
    {
        if(array[i] == array[i+1])
            return 1;
    }
    return 0;
}

int getLevel(int array[],int index,int n)
{
    int i,ans=0;
    if(n==2 && array[0]==array[1])
    {
        return -1;
    }
    for(i=index;i<n-1;i++)
    {
        if(array[i]==array[i+1])
            ans = i+1;
        else
        { 
            return i+1;
        }
    }
    if(ans==n-1)
        return ans+1;
    return ans;
}

void deploy(int array[],int index,int level,int n)
{
    int i;
    for(i=level;i<n;i++)
    {
        array[index]=array[i];
        index++;
    }
}

int main() {

    int n,i,level;
    scanf("%d",&n);
    int array[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&array[i]);
    }
    
    while(test(array,n))
    {
        for(i=0;i<n;i++)
        {
            if(array[i] == array[i+1])
            {
                level = getLevel(array,i,n);
                if(level == -1)
                {
                    n=0;
                    printf("No Elements");
                    return 0;
                }
                deploy(array,i,level,n);
                n = n -(level - i);
                if(n==0)
                {
                    printf("No Elements");
                    return 0;
                }
                break;
            }
        }
    }
    
    for(i=0;i<n;i++)
    {
        printf("%d ",array[i]);
    }
    return 0;
}
