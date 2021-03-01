#include<iostream>
using namespace std;
int main()
{
int n,x,temp=0,flag=0;
cin>>n;
for(int i=0;i<n;i++)
{
    cin>>x;
    flag+=x;
    if(flag<0)
    {
        temp++;
        flag=0;
    }
}
cout<<temp;

return 0;
}
