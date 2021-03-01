#include<stdio.h>
#include<math.h>
#include<stdlib.h>
int main(int args,char *argv[])
{
	int n=atoi(argv[1]);
	float area=22/7*n*n;
	printf("Area of circle : %f\n",area);
	return 0;
}
