#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include <time.h>
#include <unistd.h>
//#define DELAY 500000000
#define DELAY 100

typedef struct
{
    int hour;
    int minute;
    int second;
}mytime;

void time_init(mytime *timee) //name clashing with inbuilt time function time from time.h
{
    time_t T = time(NULL);
    struct tm tm = *localtime(&T);
    timee->hour=tm.tm_hour;
    timee->minute=tm.tm_min;
    timee->second=tm.tm_sec;
}

void update(mytime *time)
{
    time->second++;
    if(time->second==60)
    {
        time->minute++;
        time->second=0;
    }
    if(time->minute==60)
    {
        time->minute=0;
        time->hour++;
    }
    if(time->hour==24)
    {
        time_init(time);
    }
}

void delay(void)
{
    int i;
    for(i=0;i<DELAY;i++);
}

void displayTime(mytime *time)
{
    char str[3]="AM";
    if(time->hour > 12)
    {
        time->hour-=12;
        str[0]='P';
    }
    printf("%2d : %2d : %2d %s\n",time->hour,time->minute,time->second,str);
}

int main()
{
    mytime time;
    time_init(&time);
    while(1)
    {
        displayTime(&time);
        //delay();
        sleep(1);
        update(&time);
    }
}