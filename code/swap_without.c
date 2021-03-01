#include<stdio.h>
#include<stdlib.h>
void swapmult(int*,int*);
void swapadd(int*,int*);
int main(int args,char *argv[])
{
    int a=atoi(argv[1]),b=atoi(argv[2]);
    swapmult(&a,&b);
    printf("swap using multiplication: %d,%d\n",a,b);
    swapadd(&a,&b);
    printf("swap using multiplication: %d,%d\n",a,b);
}
void swapmult(int *a,int *b)
{
    *a=*a**b;
    *b=*a/(*b);
    *a=*a/(*b);
}
void swapadd(int *a,int *b)
{
    *a=*a+*b;
    *b=*a-(*b);
    *a=*a-(*b);
}
