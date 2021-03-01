#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(int argc,char **argv)
{
    char str[100];
    int n,i=0;
    n=strlen(argv[1]);
    while(i<n)
    {
        str[i]=*(argv[1]+i);
        i++;
    }
    printf("%s",str);
    return 0;
}
