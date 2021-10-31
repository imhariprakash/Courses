/*
In this problem you will continue developing the data feature which you started implementing in the previous problem. You will implement a "tomorrow" feature in the C programming language via a function called "advanceDay()". The function advanceDay() should take as input a date (stored in a struct date) and return the date of the following day. You do not have to take into account leap years (although you may if you wish to). That is, it is okay for your function to always return March 1 as the day following February 28, no matter the year.

You are provided with a familiar date structure definition, a main function as well as the function prototypes for the readDate(), printDate(), and advanceDate() functions. Do not modify any of the given code. Simply add your function definitions underneath the main() function. For the readDate() and printDate() functions you may simply copy and paste the code you developed in the previous task.



Examples
Input:
2018 10 2
Output:
10/02/2018

10/03/2018


Input:
2018 10 31
Output:
10/31/2018

11/01/2018


Input:
2018 11 30
Output:
11/30/2018

12/01/2018


Input:
2018 12 31
Output:
12/31/2018

01/01/2019
*/

#include <stdio.h>

struct date {
        int year;
        int month;
        int day;
    };

/* function prototypes */
void printDate(struct date);
void readDate(struct date *);
struct date advanceDay(struct date);

int main(void) {
	struct date today, tomorrow;
	readDate(&today);
	printDate(today);
	tomorrow = advanceDay(today);
    printDate(tomorrow);
	return 0;
}

void readDate(struct date *dat)
{
    scanf("%d %d %d",&(*dat).year,&(*dat).month,&(*dat).day);
}
void printDate(struct date dat)
{
    printf("%02d/%02d/%d\n",dat.month,dat.day,dat.year);
}
struct date advanceDay(struct date dat)
{
    if(dat.day<28)
    {
        dat.day+=1;
        return(dat);
    }
    else if(dat.month ==2)
    {
       if(dat.year%4==0 && dat.year%100 !=0)
       {
           dat.day+=1;
           return(dat);
       }
       else
       {
           dat.day=1;
           dat.month+=1;
           return(dat);
       }
    }
    else if(dat.month==4 || dat.month==6 || dat.month==9 || dat.month==11)
    {
       if(dat.day<30)
       {
           dat.day+=1;
           return(dat);
       }
       else
       {
           dat.day=1;
           dat.month=(dat.month % 12)+1;
           return(dat);
       }
    }
    else if(dat.month==1 || dat.month==3 || dat.month==5 || dat.month==7 || dat.month==8 || dat.month==10 ||dat.month==12)
    {
        if(dat.day<=30)
       {
           dat.day+=1;
           return(dat);
       }
       else
       {
           dat.day=1;
           if(dat.month==12)
           {
               dat.year+=1;
           }
           dat.month=(dat.month % 12)+1;
           return(dat);
       }
    }
};
