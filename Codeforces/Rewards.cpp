#include<iostream>
using namespace std;
int main()
{
    int a[2],b[2],n;
    int temp=0,flag=0,p=0,q=0;
    for(int i=0;i<3;i++)
    {
        cin>>a[i];
        temp=temp+a[i];
    }
        for(int i=0;i<3;i++)
    {
        cin>>b[i];
        flag=flag+b[i];
    }
    cin>>n;
    if(temp%5!=0)
        p=1;
    int c=temp/5+p;
    if(flag%10!=0)
        q=1;
    int d=flag/10+q;
    if((c+d)<=n)
    {
        cout<<"YES";
    }
    else
        cout<<"NO";


return 0;
}
