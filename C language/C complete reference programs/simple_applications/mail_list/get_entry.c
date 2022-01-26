#include<stdio.h>
#include<string.h>
#include<stdlib.h>

#define MAX 100

struct
{
    char name[30];
    char street[30];
    char city[20];
    char state[20];
    unsigned long int zip;
    int door_num;
}add_list[MAX];

int main()
{
    char temp1[7],temp2[4];
    int slot=1;
    printf("Enter the name: ");
    fgets(add_list[slot].name,30,stdin);
    printf("Enter the street: ");
    fgets(add_list[slot].street,30,stdin);
    printf("Enter the city: ");
    fgets(add_list[slot].city,20,stdin);
    printf("Enter the state: ");
    fgets(add_list[slot].state,20,stdin);
    printf("Enter the zip: ");
    fgets(temp1,7,stdin);
    add_list[slot].zip=strtoul(temp1,'\0',10);  
    printf("Enter the door number: ");
    fgets(temp2,4,stdin); 
    add_list[slot].door_num=atoi(temp2);
}