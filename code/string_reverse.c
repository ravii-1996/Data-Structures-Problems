#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(int argc,char **argv)
{
    int n=strlen(argv[1]);
    int i=n-1;
    while(i>=0)
    {
        printf("%c",argv[1][i]);
        i--;
    }
    printf("\n");
    return 0;
}
