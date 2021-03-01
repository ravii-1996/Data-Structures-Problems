#include<stdio.h>
#include<stdlib.h>
int main(int agrc,char **argv)
{
    FILE *f=fopen("test.txt","r");
    char ch;
    if(f==NULL)
        printf("file doesnt exists\n");
    while(1)
    {   ch=fgetc(f);
        if(feof(f))
        {
            break;
        }
        printf("%c",ch);
    }
    printf("\nSuccessfully read\n");
    return 0;
}
