#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include<assert.h>
#define MAX_CHARACTERS 1005
#define MAX_PARAGRAPHS 5

char* kth_word_in_mth_sentence_of_nth_paragraph(char**** document, int k, int m, int n) {
    return(document[n-1][m-1][k-1]);
}

char** kth_sentence_in_mth_paragraph(char**** document, int k, int m) { 
    return(document[m-1][k-1]);
}

char*** kth_paragraph(char**** document, int k) {
    return(document[k-1]);
}

char**** get_document(char* text) {
    char**** doc;
    int para = 1, sent = 1, word = 1,i;
    doc = (char****)malloc(sizeof(char***)); //has pointer to para(char***)
    doc[0] = (char***)malloc(sizeof(char**)); //has pointer to sent - array of string - char**
    doc[0][0] = (char**)malloc(sizeof(char*)); //words-(pointer)char* - single string
    doc[0][0][0] = (char*)text; //text char* -> address to 1 st character.
    
    for(i=0; text[i+1] != '\0'; i++)
    {
        if(text[i+1] == '\n')
        {
            text[i]='\0';
            i++;
        }
        
        switch(text[i])
        {
            case '\n' :
                para++;
                doc = (char****)realloc((char****)doc, para * sizeof(char***)); //assign to doc(char****)
                sent = 0;
            
            case '.' :
                sent++;
                doc[para-1] = (char***)realloc((char***)doc[para-1], sent * sizeof(char*));
                word = 0;
            
            case ' ' :
                word++;
                doc[para-1][sent-1] = (char**)realloc((char**)doc[para-1][sent-1], word * sizeof(char*));
                doc[para-1][sent-1][word-1] = &text[i+1];
                text[i] = '\0';       // \n, . ,' ' -> come to ' ' -> that will be \0
        }
    }
    text[i] = '\0';
    return((char****)doc);
    
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

void print_word(char* word) {
    printf("%s", word);
}

void print_sentence(char** sentence) {
    int word_count;
    scanf("%d", &word_count);
    for(int i = 0; i < word_count; i++){
        printf("%s", sentence[i]);
        if( i != word_count - 1)
            printf(" ");
    }
} 

void print_paragraph(char*** paragraph) {
    int sentence_count;
    scanf("%d", &sentence_count);
    for (int i = 0; i < sentence_count; i++) {
        print_sentence(*(paragraph + i));
        printf(".");
    }
}

int main() 
{
    char* text = get_input_text();
    char**** document = get_document(text);

    int q;
    scanf("%d", &q);

    while (q--) {
        int type;
        scanf("%d", &type);

        if (type == 3){
            int k, m, n;
            scanf("%d %d %d", &k, &m, &n);
            char* word = kth_word_in_mth_sentence_of_nth_paragraph(document, k, m, n);
            print_word(word);
        }

        else if (type == 2){
            int k, m;
            scanf("%d %d", &k, &m);
            char** sentence = kth_sentence_in_mth_paragraph(document, k, m);
            print_sentence(sentence);
        }

        else{
            int k;
            scanf("%d", &k);
            char*** paragraph = kth_paragraph(document, k);
            print_paragraph(paragraph);
        }
        printf("\n");
    }     
}