#include<iostream>
#include<string>
using namespace std;
int main()
{
    int n,temp=0,flag=0;
    cin>>n;
    string str;
    cin>>str;
    char ch;
    for(int i=0;i<str.length();i++)
    {
        ch=str.at(i);
        if(ch=='A')
            temp++;
        else if(ch=='D')
            flag++;

    }
    if(temp>flag)
        cout<<"Anton";
    else if(temp<flag)
        cout<<"Danik";
    else if(temp==flag)
        cout<<"Friendship";

    return 0;
}
