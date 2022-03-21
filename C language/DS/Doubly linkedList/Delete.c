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

struct node * getFirst(struct node *head, int value){
    struct node *temp = malloc(sizeof(struct node));
    temp -> data = value;
    temp -> prev = NULL;

    if(head == NULL){
        temp -> next = NULL;
    }
    else{
        temp -> next = head;
        head -> prev = temp;
    }

    return temp;
}

struct node * addLast(struct node *tail, int value){
    struct node *temp = malloc(sizeof(struct node));
    temp -> data = value;
    temp -> next = NULL;

    if(tail == NULL){
        temp -> prev = NULL;
    }
    else{
        tail -> next = temp;
        temp -> prev = tail;
    }

    return temp;
}

void search(struct node *head, int key){
    struct node *temp = head;
    while(temp != NULL){
        if(temp -> data == key){
            printf("Found\n");
            return;
        }
        temp = temp -> next;
    }
    printf("Not found\n");
}

struct node * delete(struct node *head, int key){
    struct node *temp = head;
        while(temp -> next != NULL){
            if(temp -> next -> data == key){
                temp -> next -> next -> prev = temp;
                temp -> next = temp -> next -> next;
                return head;
            }
            temp = temp -> next;
        }
        printf("Key not found.\n");
        return head;
}

int main(){
    int choice, value, key;
    struct node *head = NULL, *tail = NULL;

    printf("1. add 2. display 3. exit\n");

    do{
        printf("Enter choice : ");
        scanf("%d",&choice);
        if(choice == 1){
            printf("Enter the value : ");
            scanf("%d",&value);
            if(head == NULL){
                tail = addLast(tail, value);
                head = tail;
            }
            else{
                tail = addLast(tail, value);
            }
        }
        else if(choice == 2){
            printList(head);
            revPrintList(tail);
        }
        else if(choice == 3){
            break;
        }
    }while(1);

    do{
        printf("Enter the key : ");
        scanf("%d",&key);
        if(key == -1){
            break;
        }

        else if(head == NULL && tail == NULL){
            printf("Empty.\n");
            break;
        }

        else if(head -> next == NULL){
            head = tail = NULL;
        }

        else if(head -> data == key){
            head = head -> next;
            head -> prev = NULL;
        }

        else if(tail -> data == key){
            tail = tail -> prev;
            tail -> next = NULL;
        }

        else{
            head = delete(head, key);
        }

        printList(head);
        revPrintList(tail);

    }while(1);

    Deallocate(head);
}
