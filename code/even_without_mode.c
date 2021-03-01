#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(int args,char *argv[])
{
    int n=strlen(argv[1]);
    if(*(argv[1]+n-1)=='0'||*(argv[1]+n-1)=='2'||*(argv[1]+n-1)=='4'||*(argv[1]+n-1)=='6'||*(argv[1]+n-1)=='8')
    {
        printf("Number %s is even\n",argv[1]);
    }
    else
        printf("Number %s is odd\n",argv[1]);
    return 0;
}
