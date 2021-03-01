#include<stdio.h>
#include<math.h>
#include<stdlib.h>
void swap(int*,int*);
int main(int args,char *argv[])
{
    int a=atoi(argv[1]),b=atoi(argv[2]);
    swap(&a,&b);
    printf("swap : %d,%d\n",a,b);
}
void swap(int *a,int *b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}
