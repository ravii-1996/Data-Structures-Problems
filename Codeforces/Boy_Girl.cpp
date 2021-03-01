#include<iostream>
#include<string.h>
using namespace std;
int main()
{
    int temp=0,flag=0;
    string str;
    cin>>str;
    for(int i=0;i<str.length();i++)
    {
        for(int j=0;j<i;j++)
        {
            if(str.at(i)==str.at(j))
            {
                temp++;
                break;
            }
        }

    }
    //cout<<str.length()-temp;
    if((str.length()-temp)%2==0)
        cout<<"CHAT WITH HER!";
    else
        cout<<"IGNORE HIM!";
}
