#include<stdio.h>
#include<stdlib.h>
int main(int argc,char *argv[])
{
    FILE *f=fopen("test.txt","w+");
    if(f==NULL)
    {
        printf("File doesnt found\n");
        exit(1);
    }
    fputs(argv[1],f);
    printf("Successfully file created\n");
    return 0;
}
