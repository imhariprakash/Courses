#include<stdio.h>
#include<stdlib.h>
#include<math.h>

void array_initialize(char *array,int size)
{
    int i,j;
    for(i=0;i<size;i++)
    {
        for(j=0;j<size;j++)
        {
            *((char*)array)='+';
            array++;
        }
    }
}

void print_Array(char *array,int size)
{
    int i,j;
    for(i=0;i<size;i++)
    {
        printf("\n");
        for(j=0;j<size;j++)
        {
            printf(" ___ ");
        }
        printf("\n");
        for(j=0;j<size;j++)
        {
            printf("| %c |",*array);
            array++;
        }
        printf("\n");
        for(j=0;j<size;j++)
        {
            printf("|___|");
        }
        }
    printf("\n\n");
}

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
    int i,player=1,size=3,row,col,steps=0,win=0;
    char array[3][3];
    char* arr=&array[0][0];
    array_initialize(arr,size);
    print_Array(arr,size);
    while(steps!=size*size)
    {
        while(1)
        {
            printf("Player %d : ",player);
            printf("Enter the row: ");
            scanf("%d",&row);
            printf("Enter the column: ");
            scanf("%d",&col);
            if(row>size || col>size)
            {
                printf("\nIndex out of range!\n\n");
            }
            else if(array[row-1][col-1]=='X' || array[row-1][col-1]=='x' || array[row-1][col-1]=='o' || array[row-1][col-1]=='O')
            {
                printf("\nAlready filled!\n\n");
            }
            else if(array[row-1][col-1]=='+' && row<=size && col<=size)
            {
                if(player % 2 == 0)
                {
                    array[row-1][col-1]='X';
                    if(check_winner(arr,size,'X'))
                    {
                        print_Array(arr,size);
                        printf("\nplayer 2 Won\n\n");
                        return 0;
                    }
                    player=1;
                    steps++;
                }
                else
                {
                    array[row-1][col-1]='O';
                    if(check_winner(arr,size,'O'))
                    {
                        print_Array(arr,size);
                        printf("\nplayer 1 Won\n\n");
                        return 0;
                    }
                    player=2;
                    steps++;
                }
                break;
            }
        }
        print_Array(arr,size);
    }
    if(steps==9 && win==0)
    {
        printf("\nMatch drawn!\n\n");
    }

}