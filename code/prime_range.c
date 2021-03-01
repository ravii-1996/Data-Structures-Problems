#include<stdio.h>
#include<stdlib.h>
int main(int argc, char *argv[])
{
    int a,b,i,j,count;
    a=atoi(argv[1]);
    b=atoi(argv[2]);
    for(i=a;i<=b;i++)
    {
        count=0;
        for(j=2;j<i;j++)
        {
            if(i%j==0)
                count++;

        }
        if(count==0)
        {
            printf("%d\t",i);
        }
    }

return 0;
}
