#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#include<string.h>

int main()
{
    int i,j;
    char word[100];
    char *dict[][40]={"atlas","A volume of maps","car","A motorized vehicle","telephone","A communication device","airplane","A flying machine","monkey","An animal","milk","Edible food item from cow"};
    
    // 2d array of some rows and 40 columns - having char pointers
    // 12 words returning 12 pointers - 0 th row can hold upto 40 pointers - so only one row enough - c initializes one row having
    // 40(0 th index to 39 th  index) for *dict[][40].

    printf("Enter the word: ");
    scanf("%s",word);
    int number_of_rows=(int)(sizeof(dict)/sizeof(dict[0]));
    int number_of_columns=(int)(sizeof(dict[0])/sizeof(dict[0][0]));
    printf("\n%d\n",number_of_columns);

    for(i=0;i<number_of_rows;i++)
    {
        for(j=0;dict[i][j];j++)    //*dict[i][j] - for initialized pointers - no problem what about uninitialized - core dump - null address
        {                          //dict[i][j]  - initialized pointer has some value -address - uninitialized pointers - null address - so condition failed
            if(!strcmp(dict[i][j],word))
            {
                printf("Matched!\n");
                return 0;
            }
        }
    }
    printf("Not matched!\n");
    return 0;
}
