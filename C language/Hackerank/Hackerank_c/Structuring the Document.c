#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <assert.h>
#define MAX_CHARACTERS 1005
#define MAX_PARAGRAPHS 5

struct word {
    char* data;
};

struct sentence {
    struct word* data;
    int word_count;//denotes number of words in a sentence
};

struct paragraph {
    struct sentence* data  ;
    int sentence_count;//denotes number of sentences in a paragraph
};

struct document {
    struct paragraph* data;
    int paragraph_count;//denotes number of paragraphs in a document
};
struct document get_document(char* text) {
    int para = 1, sent = 1, words = 1, i;
    struct document *Doc;
    Doc =(struct document*)malloc(sizeof(struct document));
    Doc->data = (struct paragraph*)malloc(sizeof(struct paragraph));
    Doc->paragraph_count = 1;
    Doc->data[0].data = (struct sentence*)malloc(sizeof(struct sentence));
    Doc->data[0].sentence_count = 1;
    Doc->data[0].data[0].data[0].data = (char*)text;
    Doc->data[0].data[0].word_count = 1;
    
    for(i = 0; text[i+1] != '\0'; i++)
    {
        if(text[i+1] == '\n')
        {
            text[i] = '\0';
            i++;
        }
        
        switch(text[i])
        {
            case '\n' :
                para++;
                (Doc->paragraph_count)++;
                Doc->data = (struct paragraph*)realloc(Doc->data, para * sizeof(struct paragraph));
                sent = 0; //now create 1 st sentence(case \n true - all others true)
                Doc->data[para-1].sentence_count = 0;
                
            case '.' :
                sent++;
                (Doc->data[para-1].sentence_count)++;
                Doc->data[para-1].data = (struct sentence*)realloc(Doc->data[para-1].data, sent * sizeof(struct sentence));
                words = 0;
                Doc->data[para-1].data[sent-1].word_count = 0;
            
            case ' ' :
                words++;
                (Doc->data[para-1].data[sent-1].word_count)++;
                Doc->data[para-1].data[sent-1].data = (struct word*)realloc(Doc->data[para-1].data[sent-1].data, words * sizeof(struct word));
                Doc->data[para-1].data[sent-1].data[words-1].data = (char*)&text[i+1];
                text[i] = '\0';
        }
    }
    text[i] = '\0';
    return((struct document)*Doc);
}

struct word kth_word_in_mth_sentence_of_nth_paragraph(struct document Doc, int k, int m, int n) {
    return(Doc.data[n-1].data[m-1].data[k-1]);
}

struct sentence kth_sentence_in_mth_paragraph(struct document Doc, int k, int m) { 
    return(Doc.data[m-1].data[k-1]);
}

struct paragraph kth_paragraph(struct document Doc, int k) {
    return(Doc.data[k-1]);
}


void print_word(struct word w) {
    printf("%s", w.data);
}

void print_sentence(struct sentence sen) {
    for(int i = 0; i < sen.word_count; i++) {
        print_word(sen.data[i]);
        if (i != sen.word_count - 1) {
            printf(" ");
        }
    }
}

void print_paragraph(struct paragraph para) {
    for(int i = 0; i < para.sentence_count; i++){
        print_sentence(para.data[i]);
        printf(".");
    }
}

void print_document(struct document doc) {
    for(int i = 0; i < doc.paragraph_count; i++) {
        print_paragraph(doc.data[i]);
        if (i != doc.paragraph_count - 1)
            printf("\n");
    }
}

char* get_input_text() {	
    int paragraph_count;
    scanf("%d", &paragraph_count);

    char p[MAX_PARAGRAPHS][MAX_CHARACTERS], doc[MAX_CHARACTERS];
    memset(doc, 0, sizeof(doc));
    getchar();
    for (int i = 0; i < paragraph_count; i++) {
        scanf("%[^\n]%*c", p[i]);
        strcat(doc, p[i]);
        if (i != paragraph_count - 1)
            strcat(doc, "\n");
    }

    char* returnDoc = (char*)malloc((strlen (doc)+1) * (sizeof(char)));
    strcpy(returnDoc, doc);
    return returnDoc;
}

int main() 
{
    char* text = get_input_text();
    struct document Doc = get_document(text);

    int q;
    scanf("%d", &q);

    while (q--) {
        int type;
        scanf("%d", &type);

        if (type == 3){
            int k, m, n;
            scanf("%d %d %d", &k, &m, &n);
            struct word w = kth_word_in_mth_sentence_of_nth_paragraph(Doc, k, m, n);
            print_word(w);
        }

        else if (type == 2) {
            int k, m;
            scanf("%d %d", &k, &m);
            struct sentence sen= kth_sentence_in_mth_paragraph(Doc, k, m);
            print_sentence(sen);
        }

        else{
            int k;
            scanf("%d", &k);
            struct paragraph para = kth_paragraph(Doc, k);
            print_paragraph(para);
        }
        printf("\n");
    }     
}





/*


2
In a prologue a young couple at a diner discuss their life of crime as robbers and the prospect of robbing a restaurant.They decide to rob the diner and begin the holdup.
Hitmen Jules Winnfield and Vincent Vega arrive at an apartment to retrieve a briefcase for their boss.After Vincent checks the contents of the briefcase Jules shoots one of the associates of Brett.
3
3 4 1 2
2 1 1
1 1



2
C programming language is tought to people who are new to programming.
Pointers is one of the very important topics in C.They have wide application in C.
3
1 2
2 1 1
3 1 1 1



2
In a prologue a young couple at a diner discuss their life of crime as robbers and the prospect of robbing a restaurant.They decide to rob the diner and begin the holdup.
Hitmen Jules Winnfield and Vincent Vega arrive at an apartment to retrieve a briefcase for their boss.After Vincent checks the contents of the briefcase Jules shoots one of the associates of Brett.
1
1 1



2
In a prologue a young couple at a diner discuss their life of crime as robbers and the prospect of robbing a restaurant.They decide to rob the diner and begin the holdup.
Hitmen Jules Winnfield and Vincent Vega arrive at an apartment to retrieve a briefcase for their boss.After Vincent checks the contents of the briefcase Jules shoots one of the associates of Brett.
5
3 4 1 1
3 5 1 1
3 6 1 1
2 1 2
2 2 2


2
Learning C is fun.
Learning pointers is more fun.It is good to have pointers.
3
1 2
2 1 1
3 1 1 1

*/