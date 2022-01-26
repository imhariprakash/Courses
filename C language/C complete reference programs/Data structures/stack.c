#include<stdio.h>
#include<stdlib.h>

int stack_size=100;

void pop(int* stack,int* elem)
{
    if(*elem==0)
    {
        printf("Underflow occured!\n");
    }
    else
    {
        *(stack+(*elem-1))='\0';
        *elem=*elem-1;
    }
}

void push(int* stack,int* elem)
{
    int num;
    if(*elem==stack_size)
    {
        printf("Overflow occured!\n");
    }
    else
    {
        printf("Enter the element: ");
        scanf("%d",&num);
        *(stack+(*elem))=num;
        *elem=*elem+1;
    }
}

void printArray(int* stack,int elem)
{
    int i;
    printf("The stack is: \n");
    for(i=0;i<elem;i++)
    {
        printf("%d  ",*(stack+i));
    }
    printf("\n\n");
}

int main()
{
    int n,stack[stack_size],elem=0;
    int *stackPtr=stack;
    printf("1-stop\n2-push\n3-pop\n\nEnter your choice: ");
    scanf("%d",&n);
    while(n!=1)
    {
        if(n==2)
        {
            push(stackPtr,&elem);
        }
        else if(n==3)
        {
            pop(stackPtr,&elem);
        }
        else
        {
            printf("You have entered a wrong choice.\n");
            break;
        }
        printf("Enter your choice: ");
        scanf("%d",&n);
    }
    printf("Stopped!\n");
    printArray(stackPtr,elem);
}