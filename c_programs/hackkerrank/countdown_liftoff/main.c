#include<stdio.h>
#include<math.h>
int main()
{
    int hour,minute,second;
    printf("Enter the number of hours: ");
    scanf("%d",&hour);
    printf("\nEnter the number of minutes: ");
    scanf("%d",&minute);
    printf("\nEnter the number of seconds: ");
    scanf("%d",&second);
    if(hour<0 || minute<0 || second<0 || floor(hour)!=hour || floor(minute)!=minute || floor(second)!=second)
    {
        printf("\nThe values must be as positive integer numbers!");
        return(0);
    }
    while(1)
    {
        sleep(1);
        printf("%d : %d : %d\n",hour,minute,second);
        if(hour==0 && minute==0 && (second==0||second==3))
            break;
        else if(second!=0)
            second-=1;
        else if(second==0 && minute !=0){
            minute-=1;
            second=59;}
        else if(second==0 && minute ==0 && hour!=0){
            hour-=1;
            minute=59;
            second=59;
        }
        
    }
    printf("Ready!\n");
    sleep(1);
    printf("Steady!\n");
    sleep(1);
    printf("Lift off!\n");
    return(0);
}


