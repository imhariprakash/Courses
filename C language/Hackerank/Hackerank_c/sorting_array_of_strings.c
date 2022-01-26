#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int lexicographic_sort(const char* a, const char* b) {
    return(strcmp(a,b));
}

int lexicographic_sort_reverse(const char* a, const char* b) {
    return(-1 * strcmp(a,b));
}

int distinct_char(const char *a)  //since function's argument is const
{
    int alpha[26]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},temp,count=0;
    for(int i=0;i<strlen(a);i++)
    {
        temp=((int)*((char*)a+i))-97;
        if(alpha[temp] ==0)
        {
            alpha[temp]++;
            count++;
        }
            
    }
    return count;
}

int sort_by_number_of_distinct_characters(const char* a, const char* b) {
    if(distinct_char(a) == distinct_char(b))
        return(strcmp(a,b));
    if(distinct_char(a) > distinct_char(b))
        return 1;
    if(distinct_char(b) > distinct_char(a))
        return -1;   
}

int sort_by_length(const char* a, const char* b) {
    if(strlen(a) == strlen(b))
        return(strcmp(a,b));     //0-same,+ve- a>b , -ve -> a<b
    if(strlen(a) > strlen(b))
        return 1;                //a>b //length not same
    if(strlen(b) > strlen(a))
        return -1;               //a<b //length not same
}

void string_sort(char** arr,const int len,int (*cmp_func)(const char* a, const char* b)){
    int temp;
    char *swtemp; //swap temp
    for(int i=0; i < len-1; i++)
    {
        for(int j=i; j < len; j++)
        {
            temp = cmp_func(*((char**)arr+i),*((char**)arr+j));
            if(temp > 0)        //when +ve - means - a > b so swap  swap swapuuu
            {
                swtemp = *((char**)arr+i);
                *((char**)arr+i) = *((char**)arr+j);
                *((char**)arr+j) = swtemp;
            }
        }
    }
}


int main() 
{
    int n;
    scanf("%d", &n);
  
    char** arr;
	arr = (char**)malloc(n * sizeof(char*));
  
    for(int i = 0; i < n; i++){
        *(arr + i) = malloc(1024 * sizeof(char));
        scanf("%s", *(arr + i));
        *(arr + i) = realloc(*(arr + i), strlen(*(arr + i)) + 1);
    }
  
    string_sort(arr, n, lexicographic_sort);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]);
    printf("\n");

    string_sort(arr, n, lexicographic_sort_reverse);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]); 
    printf("\n");

    string_sort(arr, n, sort_by_length);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]);    
    printf("\n");

    string_sort(arr, n, sort_by_number_of_distinct_characters);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]); 
    printf("\n");
}





/*

fekls   - f,q,s,w
qoi
sbv
wkue

wkue
sbv      - w,s,q,f
qoi
fekls

qoi
sbv      - 3dist,3 dist, 4 ,5
wkue
fekls

qoi
sbv      length : 3,3,4,5
wkue
fekls


*/