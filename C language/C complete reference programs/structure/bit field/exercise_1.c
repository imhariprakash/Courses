#include <stdio.h>
struct test {
	unsigned int x;
	long int y : 33;   //limits exceeding
	unsigned int z;
};
int main()
{
	struct test t;
	unsigned int* ptr1 = &t.x;
	unsigned int* ptr2 = &t.z;    //bitfields can't be accessed by pointers - since no guarantee they start from byte boundary - dealing with bits
	printf("%d", ptr2 - ptr1);
	return 0;
}
