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

int search(struct node *head, int num){
    struct node *temp = head;

    do{
        if(temp->data == num){
            return 1;
        }
        temp = temp->next;
    }while(temp != head);

    return -1;
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
    temp->prev = NULL;
    temp->next = head;
    head->prev = temp;
    head = temp;
    tail->next = head;

    return head;
}

struct node *addLast(int data, struct node *head, struct node *tail){
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp->data = data;
    temp->prev = tail;
    temp->next = head;

    tail->next = temp;
    head->prev = temp;

    return temp;
}

struct node *delete(struct node *head, int data){
    if(head -> data == data){
        struct node *temp = head -> prev;
        head = head->next;
        head->prev = temp;
        temp->next = head;
        return head;
    }
    else{
        struct node *temp = head;
        do{
            if(temp->data == data){
                temp->prev->next = temp->next;
                temp->next->prev = temp->prev;
                return head;
            }
            temp = temp->next;
        }while(temp != head);
    }
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

    tail = addLast(4, head, tail);
    tail = addLast(5, head, tail);

    printStraight(head);

    head = delete(head, 1);

    printStraight(head);
    

    return 0;
}