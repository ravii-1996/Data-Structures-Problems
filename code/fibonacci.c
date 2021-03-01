#include<stdio.h>
#include<stdlib.h>
int main(int argc,char *argv[])
{
    int n1=0,n2=1,n,i,next;
    n=atoi(argv[1]);
    for(i=1;i<=n;i++)
    {
        printf("%d\t",n1);
        next=n1+n2;
        n1=n2;
        n2=next;
    }
return 0;
}
