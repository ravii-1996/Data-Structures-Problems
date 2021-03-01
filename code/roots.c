#include<stdio.h>
#include<stdlib.h>
#include<math.h>
double discriminant(int,int,int);
void root(float,int,int);
int main(int args,char *argv[])
{
    int a=atoi(argv[1]);
    int b=atoi(argv[2]);
    int c=atoi(argv[3]);
    double D;
    D=discriminant(a,b,c);
    if(D>0)
        root(D,b,a);
    else
        printf("No Root\n");
    return 0;
}
double discriminant(int a,int b,int c)
{
    double q=b*b-4*a*c;
    return sqrt(q);
}
void root(float D,int b,int a)
{
    double y,x=(-b+D)/2*a;
    y=(-b-D)/2*a;
    printf("root : %lf\t%lf\n",x,y);
}
