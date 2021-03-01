#include<iostream>
using namespace std;
int main()
{
int flag=0,temp=0,n;
cin>>n;
int mishka[n],chris[n];
for(int i=0;i<n;i++)
{
    cin>>mishka[i]>>chris[i];
    if(mishka[i]>chris[i])
        flag++;
    else if(chris[i]>mishka[i])
        temp++;
}

if(temp==flag)
    cout<<"Friendship is magic!^^\n";
else if(flag>temp)
    cout<<"Mishka\n";
else if(temp>flag)
    cout<<"Chris\n";

return 0;
}
