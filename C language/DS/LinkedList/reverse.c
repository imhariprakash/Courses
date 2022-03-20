#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};

void printList(struct node *head){
    struct node *temp = head;
    while(temp != NULL){
        printf("%d ", temp -> data);
        temp = temp -> next;
    }
    printf("\n");
}

struct node * reverse(struct node *head){
    struct node *temp = head;
    struct node *hold;
    struct node *prev = NULL;
    while(temp != NULL){
        hold = temp -> next;
        temp -> next = prev;
        prev = temp;
        temp = hold;
    }
    return(prev);
}

int main(){
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
    head4 -> data = 50;                                          
    head5 -> data = 60;

    head -> next = head1;
    head1 -> next = head2;
    head2 -> next = head3;
    head3 -> next = head4;
    head4 -> next = head5;
    head5 -> next = NULL;

    head = reverse(head);
    printList(head);
}


/*

    struct node *head = NULL;



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
    head6 -> next = NULL;


    struct node *head = malloc(sizeof(struct node));
    head -> data = 10;
    head -> next = NULL;

*/