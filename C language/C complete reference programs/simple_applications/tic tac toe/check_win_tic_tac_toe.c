#include<stdio.h>
#include<stdio.h>
#include<math.h>

int check_winner(char *arr,int size,char symbol)
{
    int i,j,flag=1;

    for(i=0;i<size;i++)
    {
        if(*(arr+i*size+i) !=symbol)
        {
            flag=0;
            break;
        }
    }
    if(flag==1)
        return 1;

    flag=1;
    for(i=0;i<size;i++)
    {
        if(*(arr+i*size+(size-i-1)) !=symbol)
        {
            flag=0;
            break;
        }
    }
    if(flag==1)
        return 1;

    for(i=0;i<size;i++)
    {
        flag=1;
        for(j=0;j<size;j++)
        {
            if(*(arr+i*size+j) !=symbol)
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
            return 1;

        flag=1;
        for(j=0;j<size;j++)
        {
            if(*(arr+j*size+i) !=symbol)
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
            return 1;
        
    }
    return 0;
}

int main()
{
    char arr[][3]={"+X+","+X+","+X+"};
    char *array=&arr[0][0];
    int a=check_winner(array,3,'X');
    printf("%d\n\n",a);

}