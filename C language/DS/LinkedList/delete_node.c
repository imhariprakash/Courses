#include<Stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};

struct node* AddLast(struct node * head, int value){
    struct node * temp = malloc(sizeof(struct node));
    temp -> data = value;
    temp -> next = NULL;
    if(head == NULL){
        return temp;
    }
    else{
        struct node *traverse = head;
        while(traverse -> next != NULL){
            traverse = traverse->next;
        }
        traverse -> next = temp;
        return(head);
    }
}

struct node* delete(struct node * head, int value){
    if(head == NULL){
        return head;
    }
    else if(head -> data == value){
        return (head -> next);
    }
    struct node *temp = head;
    
    while(temp -> next != NULL){
        if(temp -> next -> data == value){
            temp -> next = temp -> next -> next;
            break;
        }
        temp = temp -> next;
    }
    return(head);
}


void printList(struct node *head){
    struct node *temp = head;
    while(temp != NULL){
        printf("%d ", temp -> data);
        temp = temp -> next;
    }
    printf("\n");
}

void Deallocate(struct node *head){
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

    printf("1. Add 2. Print 3. Delete -1. exit\n");

    do{
        printf("Enter choice : ");
        scanf("%d", &choice);
        if(choice == 1){
            printf("Enter value : ");
            scanf("%d", &value);
            head = AddLast(head, value);
        }
        else if(choice == 2){
            printList(head);
        }
        else if(choice == 3){
            printf("Enter value to remove: ");
            scanf("%d", &value);
            head = delete(head, value);
        }
        else if(choice == -1){
            break;
        }
    }while(1);
}