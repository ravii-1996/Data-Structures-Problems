#include<stdio.h>
int sum(int);
int main()
{
    int a=10,b;
    b=sum(a);
    printf("%d",b);
    return 0;
}
int sum(int n)
{
    if(n==1)
    return 1;
    return n+sum(n-1);
}
