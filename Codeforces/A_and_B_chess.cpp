#include<iostream>
#include<ctype.h>
using namespace std;
int main()
{
    char ch;
    int temp=0,flag=0;
for(int i=0;i<64;i++)
{
    cin>>ch;
    if(isupper(ch))
    {
        if(ch=='Q')
            temp=temp+9;
        else if(ch=='R')
            temp=temp+5;
        else if(ch=='B')
            temp=temp+3;
        else if(ch=='P')
            temp=temp+1;
          else if(ch=='N')
            temp=temp+3;
    }
    else if(islower(ch))
    {
        ch=toupper(ch);
         if(ch=='Q')
            flag=flag+9;
        else if(ch=='R')
            flag=flag+5;
        else if(ch=='B')
            flag=flag+3;
        else if(ch=='P')
            flag=flag+1;
          else if(ch=='N')
            flag=flag+3;

    }

}
if(flag>temp)
    cout<<"Black";
else if(flag<temp)
    cout<<"White";
else if(flag==temp)
    cout<<"Draw";

return 0;
}
