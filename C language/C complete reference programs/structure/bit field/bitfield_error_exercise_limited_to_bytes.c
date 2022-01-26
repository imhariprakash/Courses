#include <stdio.h>
struct test {
	unsigned int x;
	unsigned int y : 33;  //bitfields need to be limited to bytes - error
	unsigned int z;
};
int main()
{
	printf("%lu", sizeof(struct test));
	return 0;
}
