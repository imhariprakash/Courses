#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};

struct node* addFirst(struct node *head, int value){
    struct node *temp = malloc(sizeof(struct node));
    temp -> data = value;
    temp -> next = head;
    head = temp;
    return(head);
}

void printList(struct node *head){
    struct node *temp = head;
    while(temp != NULL){
        printf("%d ",temp -> data);
        temp = temp -> next;
    }
    printf("\n");
}

void spaceDeallocate(struct node *head){
    struct node *temp = head;
    while(temp != NULL){
        head = temp -> next;
        free(temp);
        temp = head;
    }
}

int main(){
    int choice, value;
    struct node *head = NULL;
    printf("-1. End 1. Insert 2. Print\n");
    do{
        printf("Enter the choice : ");
        scanf("%d",&choice);
        if(choice == 1){
            printf("Enter the value : ");
            scanf("%d",&value);
            head = addFirst(head, value);
            printf("%d\n", head -> data);
        }
        else if(choice == 2){
            printList(head);
        }
        else if(choice == -1){
            break;
        }
    }while(1);

    spaceDeallocate(head);
}