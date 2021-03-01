#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
int main(int argc,char **argv)
{
    int num=atoi(argv[1]),i=0,rmd;
    double temp=0;
    while(num!=0)
    {
        rmd=num%10;
        num=num/10;
        temp=temp+rmd*pow(2,i);
        i++;
    }
    printf("%lf\n",temp);
    return 0;
}
