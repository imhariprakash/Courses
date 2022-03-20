#include<Stdio.h>
#include<stdlib.h>

int num;

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

void printReverse(struct node *head) {
    if(head == NULL){
        return;
    }
    else{
        printReverse(head -> next);
        printf("%d ",head -> data);
    }
}

void revGetNode(struct node *head, int index){
    if(head == NULL){
            return;
        }
        else{
            revGetNode(head -> next, index);
            if(num == index){
                printf("%d\n",head -> data);
            }
            num++;
        }
}

int main(){
    int choice, value, index;
    struct node *head = NULL;

    printf("1. Add 2. Print 3. exit\n");

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
            break;
        }
    }while(1);

    do{
        num = 1;
        printf("Enter the index : ");
        scanf("%d", &index);
        if(index == -1){
            break;
        }
        revGetNode(head, index);
    }while(1);
    
    Deallocate(head);
}