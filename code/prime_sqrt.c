#include<stdio.h>
#include<stdlib.h>
int isPrime(int a)
{
    int flag=0,i;
    for(i=2;i<a/2;i++)
    {
        if(a%i==0)
            flag++;
    }
    if(flag>0)
        return 0;
    else
        return a;
}
float root(int a)
{
    float f=0.0001,sum;
    for(sum=0;sum<a;sum=sum+f)
    {
        if(sum*sum>a)
        {
            sum=sum-f;
            break;
        }
    }
    return sum;
}
int main(int argS, char *argv[])
{
    int a;
    float b;
    a=atoi(argv[1]);
    if(isPrime(a))
    {
        b=root(a);
        printf("%.2f",b);
    }
    else
        printf("Not Prime\n");
    return 0;
}
