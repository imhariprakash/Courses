#include<stdio.h>
#include<stdlib.h>

struct node{
    struct node *prev;
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

void revPrintList(struct node *tail){
    struct node *temp = tail;
    while(temp != NULL){
        printf("%d ", temp -> data);
        temp = temp -> prev;
    }
    printf("\n");
}

void Deallocate(struct node *head){
    struct node *temp = head;
    struct node *hold;
    while(temp != NULL){
        hold = temp -> next;
        free(temp);
        temp = hold;
    }
}

int main(){
    struct node *head = malloc(sizeof(struct node));
    struct node *middle = malloc(sizeof(struct node));
    struct node *tail = malloc(sizeof(struct node));

    head -> data = 10;
    middle -> data = 20;
    tail -> data = 30;

    head -> prev = NULL;
    middle -> prev = head;
    tail -> prev = middle;

    head -> next = middle;
    middle -> next = tail;
    tail -> next = NULL;

    printList(head);
    revPrintList(tail);
    Deallocate(head);
}