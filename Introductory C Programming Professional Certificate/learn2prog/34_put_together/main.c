#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "kv.h"
#include "counts.h"
#include "outname.h"

counts_t * countFile(const char * filename, kvarray_t * kvPairs) {
    counts_t* ans=createCounts();
    FILE* f=fopen(filename, "r");
    if(f==NULL) return NULL;

    char* line=NULL;
    size_t sz=0;
    while(getline(&line, &sz, f)>=0)
    {
        char* n=strchr(line, '\n');
        if(n!=NULL)
        {
            *n='\0';
        }
        char* x=lookupValue(kvPairs, line);
        addCount(ans, x);
    }
    free(line);
    if(fclose(f)!=0)
    {
        return NULL;
    }
    //WRITE ME

    return ans;
}

int main(int argc, char ** argv) {
    //WRITE ME (plus add appropriate error checking!)
    if(argc<2)
    {
        fprintf(stderr, "Not Enough arguments\n");
        return EXIT_FAILURE;
    }
    //read the key/value pairs from the file named by argv[1] (call the result kv)
    kvarray_t* kv=readKVs(argv[1]);


    //count from 2 to argc (call the number you count i)
    for(int i=2; i<argc; i++)
    {
        counts_t* c=countFile(argv[i], kv);
        if(c==NULL)
        {
            return EXIT_FAILURE;
        }
        char* outName=computeOutputFileName(argv[i]);
        FILE* f1=fopen(outName, "w");

        printCounts(c, f1);

        if(fclose(f1)!=0)
        {
            return EXIT_FAILURE;
        }

        free(outName);
        freeCounts(c);
    }

    freeKVs(kv);

    //count the values that appear in the file named by argv[i], using kv as the key/value pair
    //   (call this result c)

    //compute the output file name from argv[i] (call this outName)


    //open the file named by outName (call that f)

    //print the counts from c into the FILE f

    //close f

    //free the memory for outName and c



    //free the memory for kv

    return EXIT_SUCCESS;
}
