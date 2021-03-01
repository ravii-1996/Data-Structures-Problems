#include<iostream>
#include<string>
#include<cmath>
using namespace std;
int main()
{
    int n,temp=0,flag=0;
    string str;
    cin>>n;
    cin>>str;
    for(int i=0;i<str.length();i++)
    {
        if(str[i]=='1')
            temp++;
        else
            flag++;
    }
    cout<<fabs(temp-flag);
return 0;
}
