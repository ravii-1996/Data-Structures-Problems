#include<stdio.h>
#include<stdlib.h>
int power(int a,int b)
{
    int i=1,sum=1;
    while(i<=b)
    {
        sum=sum*a;
        i++;
    }
    return sum;
}
int main(int argc,char *argv[])
{
    int a,b,c;
    a=atoi(argv[1]);
    b=atoi(argv[2]);
    c=power(a,b);
    printf("%d\n",c);
    return 0;
}
