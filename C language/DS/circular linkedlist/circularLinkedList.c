#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};

void printCircularLL(struct node *head){
    struct node *temp = head;
    do{
        printf("%d  ",temp -> data);
        temp = temp->next;
    }while(temp != head);
}

int main(){
    struct node *head, *middle, *tail;
    head = malloc(sizeof(struct node));
    middle = malloc(sizeof(struct node));
    tail = malloc(sizeof(struct node));
    head -> data = 10;
    middle -> data = 20;
    tail -> data = 30;

    head -> next = middle;
    middle -> next = tail;
    tail -> next = head;

    printCircularLL(head);
}