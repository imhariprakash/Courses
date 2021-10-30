/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <stdlib.h>

int main()
{
  int query,shelf,**pages,*books,i,j,nshelf,npages,qtype,index;
  printf("Enter the no. of shelves: ");
  scanf("%d",&shelf);
  printf("Enter the no. of queries: ");
  scanf("%d",&query);
  books=(int*)malloc(shelf * sizeof(int));
  pages=(int**)malloc(shelf * sizeof(int*));
  for(i=0;i<shelf;i++)
  {
    books[i]=0;
    pages[i]=(int*)malloc(sizeof(int));
  }
  while(query--)
  {
    printf("Enter the query type: ");
    scanf("%d",&qtype);
    if(qtype==1)
    {
        printf("Enter the shelf where you want to place the book: ");
        scanf("%d",&nshelf);
        printf("Enter the no. of pages in your book: ");
        scanf("%d",&npages);
        books[nshelf]+=1;
        j=books[nshelf];
        pages[nshelf]=(void*)realloc(pages[nshelf],books[nshelf] * sizeof(int));
        pages[nshelf][j-1]=npages;
    }
    else if(qtype==2)
    {
        printf("Enter the Shelf of the book you want to know the no. of pages: ");
        scanf("%d",&shelf);
        printf("Enter the index(from 0) of the book you want to know the no. of pages: ");
        scanf("%d",&index);
        printf("Book in index %d from Shelf %d has %d pages.\n",index,shelf,pages[shelf][index]);
    }
    else if(qtype==3)
    {
        printf("Enter the Shelf you want to know how many books it has: ");
        scanf("%d",&shelf);
        printf("Shelf %d has %d no. of books.\n",shelf,books[shelf]);
    }
  }
  printf("Hope! You have a nice experience. Thank you!\nHave a nice day!");
  return 0;
}
