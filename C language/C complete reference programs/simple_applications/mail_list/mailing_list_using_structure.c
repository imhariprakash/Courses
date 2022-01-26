#include<stdio.h>
#include<stdlib.h>
#include<string.h>

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

void init_add_list(void)
{
    int i;
    for(i=0;i<MAX;i++)
    {
        add_list[i].name[0]='\0';
    }
}

int get_choice(void)
{
    int choice;
    printf("\n\n1.Enter an entry.\n2.Delete an entry.\n3.Display all entries.\n4.exit\n\n");
    do
    {
    printf("Enter your choice: ");
    scanf("%d",&choice);
    getchar();   //since we are using fgets also so new line char must be captured.
    }while(choice>4 || choice <1);
    
    return(choice);  //without returning also returns choice since its the only variable used here.
}

int free_slot(void)
{
    int i;
    for(i=0;i<MAX;i++)
    {
        if(add_list[i].name[0]=='\0')
            return i;
    }
    return -1;
}

void delete(void)
{
    int slot;
    printf("Enter the slot: ");
    scanf("%d",&slot);
    getchar(); // fgets is used - kill \n
    if(slot<MAX && slot >=0)
    {
        add_list[slot].name[0]='\0';
    }
}

void list(void)
{
    int i,entry=1;
    for(i=0;i<MAX;i++)
    {
        if(add_list[i].name[0])
        {
            printf("\nEntry %d: \n\n",entry);
            entry++;
            printf("Name: %s",add_list[i].name);
            printf("door number: %d\n",add_list[i].door_num);
            printf("street: %s",add_list[i].street);
            printf("city: %s",add_list[i].city);
            printf("state: %s",add_list[i].state);
            printf("zip: %ld\n",add_list[i].zip);        
        }
    }
}

void enter(void)
{
    int slot;
    char temp1[10],temp2[10];
    slot=free_slot();
    if(slot==-1)
    {
        printf("List is filled.\n");
        return ;
    }
    else
    {
        printf("\nEnter the name: ");
        fgets(add_list[slot].name,30,stdin);
        printf("Enter the street: ");
        fgets(add_list[slot].street,30,stdin);
        printf("Enter the city: ");
        fgets(add_list[slot].city,20,stdin);
        printf("Enter the state: ");
        fgets(add_list[slot].state,20,stdin);
        printf("Enter the zip: ");
        fgets(temp1,10,stdin);
        add_list[slot].zip=strtoul(temp1,'\0',10);  
        printf("Enter the door number: ");
        fgets(temp2,10,stdin); 
        add_list[slot].door_num=atoi(temp2);       
    }
}




int main()
{
    int choice;
    init_add_list();

    while(1)
    {
        choice=get_choice();
        switch(choice)
        {
            case(1):
                enter();
                break;
            case(2):
                delete();
                break;
            case(3):
                list();
                break;
            case(4):
                exit(0);
        }
    }
}
