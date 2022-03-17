#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node * next;
};

int main(){
    struct node *head, *middle, *last, *temp;
    head = malloc(sizeof(struct node));
    middle = malloc(sizeof(struct node));
    last = malloc(sizeof(struct node));
    head -> data = 10;
    middle -> data = 20;
    last -> data = 30;
    head -> next = middle;
    middle -> next = last;
    last -> next = NULL;

    temp = head;
    while(temp != NULL){
        printf("%d ",temp -> data);
        temp = temp -> next;
    }
    
}

