#include<iostream>
#include<string>
using namespace std;
int main()
{
    int temp=0,flag=0,counts=0;
string str;
cin>>str;
char ch;
for(int i=0;i<str.length();i++)
{
    ch=str.at(i);
    if(ch=='7'||ch=='4')
        temp++;
}
if(temp>0)
{
 if(temp==7||temp==4)
{
      cout<<"YES";
}
else
    cout<<"NO";
}
else
    cout<<"NO";



return 0;

}
