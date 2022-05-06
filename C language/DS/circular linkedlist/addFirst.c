#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *prev;
    struct node *next;
};

void printStraight(struct node *head){
    struct node *temp = head;

    do{
        printf("%d ", temp->data);
        temp = temp->next;
    }while(temp != head);

    printf("\n");
}

void printReverse(struct node *tail){
    struct node *temp = tail;

    do{
        printf("%d ", temp->data);
        temp = temp->prev;                      // reverse print
    }while(temp != tail);

    printf("\n");

}

struct node *addFirst(int data, struct node *head, struct node *tail){
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp->data = data;
    temp->prev = tail;
    temp->next = head;
    head->prev = temp;
    head = temp;
    tail->next = head;

    return head;
}



int main(){
    struct node *elem1, *elem2, *elem3, *head, *tail;
    elem1 = malloc(sizeof(struct node));
    elem2 = malloc(sizeof(struct node));
    elem3 = malloc(sizeof(struct node));

    head = elem1;
    tail = elem3;

    elem1->data = 1;
    elem1->prev = elem3;
    elem1->next = elem2;

    elem2->data = 2;
    elem2->prev = elem1;
    elem2->next = elem3;

    elem3->data = 3;
    elem3->prev = elem2;
    elem3->next = elem1;

    head = addFirst(0, head, tail);

    printStraight(head);
    printReverse(tail);

    

    return 0;
}
