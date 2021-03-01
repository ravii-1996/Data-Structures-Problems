#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
int main(int argc,char **argv)
{
    int a,b,angle;
    float area;
    a=atoi(argv[1]);
    b=atoi(argv[2]);
    angle=atoi(argv[3]);
    area=a*b*(sin(3.14 /180 *angle))*0.5;
    printf("%.2f",area);
    return 0;
}
