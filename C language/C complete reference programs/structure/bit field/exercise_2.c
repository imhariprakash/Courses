#include<stdio.h>

union test {
	unsigned int x : 3;    //union last one stands
	unsigned int y : 3;
	int z;
};

int main()
{
	union test t;
	t.x = 5;   //unsigned so - last one stands -> 1
	t.y = 4;   //unsigned so - last one stands -> 1
	t.z = 1;
	printf("t.x = %d, t.y = %d, t.z = %d",
		t.x, t.y, t.z);
	return 0;
}
