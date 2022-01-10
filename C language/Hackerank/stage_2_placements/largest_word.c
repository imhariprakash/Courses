#include <stdio.h>  
#include <string.h>  
   
int main()  
{     
    char string[100];
    fgets(string,100,stdin);
    char words[100][100], large[100];  
    int i = 0, j = 0, k, length;  
    for(k=0; string[k]!='\0'; k++){         
   
        if(string[k] != ' ' && string[k] != '\0'){  
            words[i][j++] = string[k];  
        }  
        else{  
            words[i][j] = '\0';  
            i++;   
            j = 0;  
        }  
    }     
  
    length = i + 1;          
    strcpy(large, words[0]);        
    for(k = 0; k < length; k++){               
        if(strlen(large) < strlen(words[k]))  
            strcpy(large, words[k]);  
    }        
    printf("%s\n%d", large,(int)strlen(large));        
    return 0;  
}  