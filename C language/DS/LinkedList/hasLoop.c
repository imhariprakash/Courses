#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};


int hasLoop(struct node *head){
    struct node *slow = head;
    struct node *fast = head;
    while(start != NULL && fast != NULL && fast -> next != NULL){
        slow = slow -> next;
        fast = fast -> next -> next;
        if(slow == fast){
            return(1);
        }
    }
    return(0);
}

int main(){
    struct node *head = malloc(sizeof(struct node));
    struct node *head1 = malloc(sizeof(struct node));
    struct node *head2 = malloc(sizeof(struct node));
    struct node *head3 = malloc(sizeof(struct node));
    struct node *head4 = malloc(sizeof(struct node));
    struct node *head5 = malloc(sizeof(struct node));
    struct node *head6 = malloc(sizeof(struct node));

    head -> data = 10;
    head1 -> data = 20;
    head2 -> data = 30;
    head3 -> data = 40;
    head4 -> data = 50;                                          
    head5 -> data = 60;
    head6 -> data = 70;

    head -> next = head1;
    head1 -> next = head2;
    head2 -> next = head3;
    head3 -> next = head4;
    head4 -> next = head5;
    head5 -> next = head6;
    head6 -> next = head6;
 
    if(hasLoop(head)){
        printf("Yes\n");                         
    }
    else{
        printf("No\n");
    }

}



/*----------------------------------------------------------------

struct node *head = NULL;
    if(hasLoop(head)){
        printf("Yes\n");                         -------------->  no
    }
    else{
        printf("No\n");
    }



struct node * head = malloc(sizeof(struct node));
    struct node *head1 = malloc(sizeof(struct node));
    struct node *head2 = malloc(sizeof(struct node));
    struct node *head3 = malloc(sizeof(struct node));
    struct node *head4 = malloc(sizeof(struct node));
    struct node *head5 = malloc(sizeof(struct node));

    head -> data = 10;
    head1 -> data = 20;
    head2 -> data = 30;
    head3 -> data = 40;
    head4 -> data = 50;                                          ---------->  No
    head5 -> data = 60;

    head -> next = head1;
    head1 -> next = head2;
    head2 -> next = head3;
    head3 -> next = head4;
    head4 -> next = head5;
    head5 -> next = NULL;
 
    if(hasLoop(head)){
        printf("Yes\n");                         
    }
    else{
        printf("No\n");
    }




struct node *head = malloc(sizeof(struct node));
    struct node *head1 = malloc(sizeof(struct node));
    struct node *head2 = malloc(sizeof(struct node));
    struct node *head3 = malloc(sizeof(struct node));
    struct node *head4 = malloc(sizeof(struct node));
    struct node *head5 = malloc(sizeof(struct node));

    head -> data = 10;
    head1 -> data = 20;
    head2 -> data = 30;
    head3 -> data = 40;
    head4 -> data = 50;                                          
    head5 -> data = 60;                                         ------------------------------------------>   Yes

    head -> next = head1;
    head1 -> next = head2;
    head2 -> next = head3;
    head3 -> next = head4;
    head4 -> next = head5;
    head5 -> next = head2; //head5 points head2
 
    if(hasLoop(head)){
        printf("Yes\n");                         
    }
    else{
        printf("No\n");
    }




 struct node *head = malloc(sizeof(struct node));
    struct node *head1 = malloc(sizeof(struct node));
    struct node *head2 = malloc(sizeof(struct node));
    struct node *head3 = malloc(sizeof(struct node));
    struct node *head4 = malloc(sizeof(struct node));
    struct node *head5 = malloc(sizeof(struct node));
    struct node *head6 = malloc(sizeof(struct node));

    head -> data = 10;
    head1 -> data = 20;
    head2 -> data = 30;
    head3 -> data = 40;
    head4 -> data = 50;                                          
    head5 -> data = 60;
    head6 -> data = 70;

    head -> next = head1;
    head1 -> next = head2;                            ---------------------------------------->    Yessssssss
    head2 -> next = head3;
    head3 -> next = head4;
    head4 -> next = head5;
    head5 -> next = head6;
    head6 -> next = head6; // head6 points itself
 
    if(hasLoop(head)){
        printf("Yes\n");                         
    }
    else{
        printf("No\n");
    }

--------------------------------------------------------------------*/

