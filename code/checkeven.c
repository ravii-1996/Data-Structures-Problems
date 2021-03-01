#include<stdio.h>
#include<stdlib.h>
void checkeven(int);
void checkodd(int);
int main(int args,char *argv[])
{
    int n=atoi(argv[1]);
    int a,i;
    for(i=2;i<=n+1;i++)
    {
        a=atoi(argv[i]);
        checkeven(a);
        checkodd(a);
    }

    return 0;
}
void checkodd(int a)
{
    if(a&1)
        printf("Method 1:ODD\n");
    else
        printf("Method 1:EVEN\n");
}
void checkeven(int a)
{
    if(a/2*2==a)
        printf("Method 2:EVEN\n");
    else
        printf("Method 2:ODD\n");
}
