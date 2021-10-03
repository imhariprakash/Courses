#include<stdio.h>
#include<string.h>
int
main ()
{
  int i = 0, j = 0;
  char a[10] = "hari", b[10] = "prakash", c[20];
  while ((i + j) < (strlen (a) + strlen (b) + 1))
    {
      if ((i + j) < (strlen (a)))
	{
	  c[i + j] = a[i];
	  i++;
	}
      else
	{
	  c[i + j] = b[j];
	  j++;
	}
    }
  printf ("\n%s", c);
  return 0;
}
