#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(int argc,char *argv[])
{
    int i=0,flag=0,n=strlen(argv[1]);
    int j=n-1;

    while(i<n/2)
    {
        if((argv[1][i])!=(argv[1][j]))
            flag++;
        i++;
        j--;
    }
    if(flag>0)
        printf("NOT Palindromen");
    else
    printf("Yes Palindrome\n");
return 0;
}
