#include<stdio.h>
int fib(int);
int main()
{
    int a,b,temp=0;
    printf("Enter the number\n");
    scanf("%d",&a);
    printf("series\n");
    for(b=0;b<a;b++)
    printf("%d\t",fib(b));
    for(b=0;b<a;b++)
    {
        temp=temp+fib(b);
    }
    printf("\nSUM = %d\n",temp);
    return 0;
}
int fib(int n)
{
    if(n==1||n==0)
    return n;
    return fib(n-1)+fib(n-2);
}
